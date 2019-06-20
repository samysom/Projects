package com.university.dao;

import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.university.dto.Application;
import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.dto.User;
import com.university.url.URL;

public class UniversityDAOImpl implements UniversityDAO {
    User users=null;
	Connection con = null;
	CallableStatement cal = null;
	Statement stmt=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int count = 0;
	
	
	@Override
	public User login(String username, String password, String role) {
	
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
//	FileReader fr=new FileReader(URL.getProperty());
//		Properties p=new Properties();
//		p.load(fr);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas?user=root&password=root");
		pstmt = con.prepareStatement("select * from users where login_id = ? and password = ? and role = ?");
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		pstmt.setString(3, role);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			User u = new User();
			u.setLoginId(rs.getString("login_id"));
			u.setPassword(rs.getString("password"));
			u.setRole(rs.getString("role"));
			 users=u;
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	return users;
}
	

	@Override
	public boolean addProgram(ProgramsOffered prog) {
		boolean state = false;
		
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("insert into programs_offered values (?,?,?,?,?)");
			pstmt.setString(1, prog.getProgramName());
			pstmt.setString(2, prog.getDescription());
			pstmt.setString(3, prog.getEligibility());
			pstmt.setInt(4, prog.getDuration());
			pstmt.setString(5, prog.getDegCerti());
			count = pstmt.executeUpdate();
			if (count>0) {
				state=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;

	}

	@Override
	public boolean updateProgram(ProgramsOffered prog) {
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("update programs_offered set description = ?, applicant_eligibility = ?, duration= ?, degree_certificate_offered = ? where ProgramName = ?");
			pstmt.setString(1, prog.getDescription());
			pstmt.setString(2, prog.getEligibility());
			pstmt.setInt(3, prog.getDuration());
			pstmt.setString(4, prog.getDegCerti());
			pstmt.setString(5, prog.getProgramName());
			count= pstmt.executeUpdate();
			if (count > 0) {
				state=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public boolean deleteProgram(String programName) {
		boolean state = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("delete from programs_offered where ProgramName = ?");
			pstmt.setString(1, programName);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public List<ProgramsOffered> listAllPrograms() {   //as there are so many prog obj we go for this
		boolean state = false;
		List<ProgramsOffered> list = new ArrayList<ProgramsOffered>();
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			 String query="select * from programs_offered";
		     stmt=con.createStatement();    
			 rs=stmt.executeQuery(query); 
		
				while (rs.next()) {        
					ProgramsOffered p = new ProgramsOffered();   //this will retrieve each obj everytime
					p.setProgramName(rs.getString(1));
					p.setDescription(rs.getString(2));
					p.setEligibility(rs.getString(3));
					p.setDuration(rs.getInt(4));
					p.setDegCerti(rs.getString(5));
					list.add(p);
				} 
			}
		 catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public boolean createScheduledProgram(ProgramsScheduled schPro) {
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("insert into programs_scheduled values (?,?,?,?,?,?)");
			pstmt.setString(1, schPro.getScheduledProgId());
			pstmt.setString(2, schPro.getProgramName());
			pstmt.setString(3, schPro.getLocation());
			pstmt.setString(4, schPro.getStartDate());
			pstmt.setString(5, schPro.getEndDate());
			pstmt.setInt(6, schPro.getSession());
			count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public boolean updateScheduledProgram(ProgramsScheduled schPro) {
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("update programs_scheduled set ProgramName = ?, location = ?, start_date = ?, end_date = ?, sessions_per_week = ? where scheduled_program_id  = ?");
			pstmt.setString(1, schPro.getProgramName());
			pstmt.setString(2, schPro.getLocation());
			pstmt.setString(3,schPro.getStartDate());
			pstmt.setString(4,  schPro.getEndDate());
			pstmt.setInt(5, schPro.getSession());
			pstmt.setString(6, schPro.getScheduledProgId());
			count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public boolean deleteScheduledProgram(String schProId) {
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("delete from programs_scheduled where scheduled_program_id  = ?");
			pstmt.setString(1, schProId);
			count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public List<ProgramsScheduled> listAllScheduledPrograms() {
		
    List<ProgramsScheduled> list = new ArrayList<ProgramsScheduled>();
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			 String query="select * from programs_scheduled";
		     stmt=con.createStatement();    
			 rs=stmt.executeQuery(query); 
		
				while (rs.next()) {
					ProgramsScheduled sp = new ProgramsScheduled();
					sp.setScheduledProgId(rs.getString(1));
					sp.setProgramName(rs.getString(2));
					sp.setLocation(rs.getString(3));
					sp.setStartDate(rs.getString(4));
					sp.setEndDate(rs.getString(5));
					sp.setSession(rs.getInt(6));
					list.add(sp);
				} 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
		
		
	}

	@Override
	public boolean applyApplication(Application app) {
		
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			
			 int rollno=0;
				PreparedStatement ps=con.prepareStatement("select max(Application_id) from Application");
				 rs=ps.executeQuery();
				
				if(rs.next())
				{
					rollno=rs.getInt(1);
					++rollno;	
			pstmt = con.prepareStatement("insert into application values (?,?,?,?,?,?,?,?,?,?)");
			pstmt.setLong(1,rollno);
			pstmt.setString(2, app.getFullName());
			pstmt.setString(3, app.getDob());
			pstmt.setString(4, app.getQualification());
			pstmt.setInt(5, app.getMarks());
			pstmt.setString(6, app.getGoals());
			pstmt.setString(7, app.getEmail());
			pstmt.setString(8, app.getScheduledProgId());
			pstmt.setString(9, app.getStatus());
			pstmt.setString(10,app.getInterviewDate());
			count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public boolean deleteApplication(long id) {
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("delete from application where Application_id = ?");
			pstmt.setLong(1, id);
			count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}

	@Override
	public boolean updateApplication(Application app) {
		
		boolean state = false;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("update application set full_name = ?, date_of_birth = ?, highest_qualification = ?,"
					+ " marks_obtained = ?,goals=?, email_id = ?, scheduled_program_id = ?, status = ?, date_of_interview = ? where application_id = ?");
			pstmt.setString(1, app.getFullName());
			pstmt.setString(2,  app.getDob());
			pstmt.setString(3, app.getQualification());
			pstmt.setInt(4, app.getMarks());
			pstmt.setString(5, app.getGoals());
			pstmt.setString(6, app.getEmail());
			pstmt.setString(7, app.getScheduledProgId());
			pstmt.setString(8, app.getStatus());
			pstmt.setString(9, app.getInterviewDate());
			pstmt.setLong(10, app.getApplicId());
			count = pstmt.executeUpdate();
			if (count > 0) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;	}

	@Override
	public List<Application> listAllApplications() {
		boolean state = false;
		List<Application> list = new ArrayList<Application>();
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			String query="select * from application";
		     stmt=con.createStatement();    
			 rs=stmt.executeQuery(query);
			
				while (rs.next()) {
					Application app = new Application();
					app.setApplicId(rs.getInt(1));
					app.setFullName(rs.getString(2));
					app.setDob(rs.getString(3));
					app.setQualification(rs.getString(4));
					app.setMarks(rs.getInt(5));
					app.setGoals(rs.getString(6));
					app.setEmail(rs.getString(7));
					app.setScheduledProgId(rs.getString(8));
					app.setStatus(rs.getString(9));
					app.setInterviewDate(rs.getString(10));
					list.add(app);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public long getApplicationId(String email) {
		
		long appId=0;
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("select application_id from application where email_id = ?");
			pstmt.setString(1, email);;
			rs = pstmt.executeQuery();
			while(rs.next()) {
				appId = rs.getLong("application_id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		return appId;
		}
		
		}


	@Override
	public boolean searchApplicationStatus(long id) {
		boolean state=false;
		
		try {
			Class.forName(URL.getDriver());
			con = DriverManager.getConnection(URL.getURL());
			pstmt = con.prepareStatement("select * from application where application_id = ?");
			pstmt.setLong(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				long aid=rs.getLong(1);
				state=true;
				//appId = rs.getLong("application_id");
			}}catch(Exception e) {
				
				e.printStackTrace();
				
			}
		finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		return state;
	}


	}
}

