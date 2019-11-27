package Encapsulation;

public class Customer1 {
	String name;
	String addr;
	String num;
	String email;
	String prooftype;
	String proofid;
	static int id=1;
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		//this.name = name;
		if (name.matches("^[a-z A-Z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
            //System.out.println("Invalid Name");
            //f=1;
            return false;
        }
	}
	public String getAddr() {
		return addr;
	}
	public boolean setAddr(String addr) {
		//this.addr = addr;
		if (addr.matches("^[a-z A-Z 0-9]*$"))
        {
            this.addr=addr;
            return true;
        }
        else
        {
           //System.out.println("Invalid Address");
            //f=2;
            return false;
            
        }
	}
	public String getNum() {
		return num;
	}
	public boolean setNum(String num) {
		//this.num = num;
		  if (num.matches("^[0-9]*$"))
          {
              this.num=num;
              return true;
          }
          else
          {
             // System.out.println("Invalid Contact Number");
              //f=3;
              return false;
          }
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		//this.email = email;
		if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
           //System.out.println("Invalid Email");
            //f=4;
            return false;
        }
    }
		
	
	public String getProoftype() {
		return prooftype;
	}
	public boolean setProoftype(String prooftype) {
		//this.prooftype = prooftype;
		if (prooftype.matches("^[a-z A-Z]*$"))
        {
            this.prooftype=prooftype;
            return true;
        }
        else
        {
           //System.out.println("Invalid prooftype");
           //f=5;
            return false;
        }
	}
	public String getProofid() {
		return proofid;
	}
	public boolean setProofid(String proofid) {
		//this.proofid = proofid;
		if (proofid.matches("^[a-z A-Z 0-9]*$"))
        {
            this.proofid=proofid;
            return true;
        }
        else
        {
           //System.out.println("Invalid Address");
            return false;
            
        }
	}
	public void display(String name, String addr, String num, String email, String prooftype, String proofid) {
		System.out.println("name   "+name);
		System.out.println("Address   "+addr);
		System.out.println("Contact number   "+num);
		System.out.println("Email   "+email);
		System.out.println("Prooftype   "+prooftype);
		System.out.println("ProofId   "+proofid);
		
		
		System.out.println("Thanks for Registering!!!Your ID is"+id);
	
	}
	public void check(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6) {
		if(!b1||!b2||!b3||!b4||!b5||!b6)
		{
			if(!b1)
			{
				System.out.println("Invalid Name");	
			}
			if(!b2)
			{
				System.out.println("Invalid Address");	
			}
			if(!b3)
			{
				System.out.println("Invalid Contact number");	
			}
			if(!b4)
			{
				System.out.println("Invalid Email");	
			}
			if(!b5)
			{
				System.out.println("Invalid Prooftype");	
			}
			if(!b6)
			{
				System.out.println("Invalid ProofID");	
			}
			
				System.out.println("Registration failed");
		}
		else
		{
			System.out.println("Registration Successfull");
		}
		if(b1 && b2 && b3 && b4 && b5 && b6)
		{
			display(getName(),getAddr(),getNum(),getEmail(),getProoftype(),getProofid());
		}
			
		}
		
	
	}

	



