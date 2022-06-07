package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Stock_Management {

			public void insert() 
			{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch (ClassNotFoundException e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Ahsan@5599");
					Statement St=con.createStatement();)
				{
					String query = "insert into Stock values(2259,'Banana chips',40,'10')";
					int count = St.executeUpdate(query);
					if(count==0) 
					{
						System.out.println("Not Updated");
					} 
					else 
					{
						System.out.println("Updated");
					}
				}
				catch(SQLException Se) 
				{
					System.out.println(Se.getMessage());
					Se.printStackTrace();
				}
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

			public void Select() 
			{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch (ClassNotFoundException e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Ahsan@5599");
					Statement St=con.createStatement();)
				{
					String query = ("select * from stock_management");
					ResultSet rs=St.executeQuery(query);

					while(rs.next()) 
					{
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t1"+rs.getString(4));
					}

				}
				catch(SQLException Se) 
				{
					System.out.println(Se.getMessage());
					Se.printStackTrace();
				}
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}


			public void update() 
			{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch (ClassNotFoundException e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Ahsan@5599");
					Statement St=con.createStatement();)
				{
					String query = "update stock set ProductName='Bourn vita' where ProductId=2261 ";
					int count = St.executeUpdate(query);
					if(count==0) 
					{
						System.out.println("Not Updated");
					} 
					else 
					{
						System.out.println("Updated");
					}
				}
				catch(SQLException Se) 
				{
					System.out.println(Se.getMessage());
					Se.printStackTrace();
				}
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

			public void delete() 
			{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch (ClassNotFoundException e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Ahsan@5599");
						Statement St=con.createStatement();)
				{
					String query = "delete from product where productid=2261";
					int count = St.executeUpdate(query);
					if(count==0) 
					{
						System.out.println("Not Deleted");
					} 
					else 
					{
						System.out.println("Deleted");
					}
				}
				catch(SQLException Se) 
				{
					System.out.println(Se.getMessage());
					Se.printStackTrace();
				}
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

			public static void main(String[] args) 
			{
				Stock_Management E= new Stock_Management();
				System.out.println("**Employ Details**");
				System.out.println("**please enter numbers between(1-4) for the CRUD operation you required ;) **");
				System.out.println("**Enter corresponding number(1.Insert, 2.Select OR, 3.Update, 4.Delete)**");
				Scanner s=new Scanner(System.in);
				int Opp=s.nextInt();
				switch(Opp) 
				{
				case 1:
					E.insert();
					break;
				case 2:
					E.Select();
					break;
				case 3:
					E.update();
					break;
				case 4:
					E.delete();
					break;
				default:
					System.out.println("**Inalid Input please Enter numbers (1-4)**");
				}
				s.close();

			}


	}


