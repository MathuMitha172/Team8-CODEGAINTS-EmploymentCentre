import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of unemployed people");
        int NoEmp=sc.nextInt();
         int reqdmanager=1;
         int reqdasst=2;
         int expmanager=10;
         int expasst=8;
         int vacoper=10,vactech=15,vaccook=5,vacserver=10,vacpho=3,vaceditor=5;
         int expope=0,exptach=2,expcook=10,expserver=0,expphoto=5,expeditor=3;
         //input in = new input();
        for(int i=0;i<NoEmp;i++)
    {
        System.out.println("-----------------------***-----------------------");
        System.out.println("                Available Jobs\n             Enter your choice\n1.IT\n2.Mech\n3.Catering\n4.Photography");
        System.out.println("-----------------------***-----------------------");
        
        int jtype=sc.nextInt();
        switch (jtype){
            case 1:
        {
            System.out.println("S.No        Jobtype          Salary          Location          WorkingHours          Experience(yrs)        Vacancy");
            System.out.println("1           Manager          50,000          Salem                 8hrs             " + expmanager +"             "+reqdmanager);
            System.out.println("2           Assitant Manager  30,000         Salem                  8hrs            " + expasst +"                 "+reqdasst);
            //in.getdetails();
            System.out.println("Enter your name : ");
		    String name = sc.next();
            System.out.println("Enter your Location : ");
		    String location = sc.next();
		    System.out.println("Enter your Mobile Number : ");
		    int mobile_No = sc.nextInt();
            System.out.println("Enter your Jobtype(S.NO) : ");
		    int Jobtype = sc.nextInt();
		    System.out.println("Enter your Experience : ");
            int empexp = sc.nextInt();
            switch(Jobtype)
            {
                case 1:
                    if(empexp>=expmanager && reqdmanager>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        reqdmanager--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
                case 2:
                    if(empexp>=expasst && reqdasst>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        reqdasst--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
            }
            break;

        }
        case 2:
        {
            System.out.println("S.No        Jobtype          Salary          Location          WorkingHours          Experience(yrs)        Vacancy");
            System.out.println("1           Operaters          10,000          Salem                 8hrs             "+ expope +"            "+vacoper);
            System.out.println("2           Technician          30,000         Salem                  8hrs           " + exptach +"           "+vactech);
            System.out.println("Enter your name : ");
		    String name = sc.next();
            System.out.println("Enter your Location : ");
		    String location = sc.next();
		    System.out.println("Enter your Mobile Number : ");
		    int mobile_No = sc.nextInt();
            System.out.println("Enter your Jobtype(S.NO) : ");
		    int Jobtype = sc.nextInt();
		    System.out.println("Enter your Experience : ");
            int empexp = sc.nextInt();
            switch(Jobtype)
            {
                case 1:
                    if(empexp>=expope && vacoper>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        vacoper--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
                case 2:
                    if(empexp>=exptach && vactech>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        vactech--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
            }
            break;

        }
        case 3:
        {
            System.out.println("S.No        Jobtype          Salary          Location          WorkingHours          Experience(yrs)        Vacancy");
            System.out.println("1           cook             20,000          Salem                 8hrs             " + expcook +"            "+vaccook);
            System.out.println("2           server           10,000         Salem                  8hrs              " + expserver +"           "+vacserver);
            System.out.println("Enter your name : ");
		    String name = sc.next();
            System.out.println("Enter your Location : ");
		    String location = sc.next();
		    System.out.println("Enter your Mobile Number : ");
		    int mobile_No = sc.nextInt();
            System.out.println("Enter your Jobtype(S.NO) : ");
		    int Jobtype = sc.nextInt();
		    System.out.println("Enter your Experience : ");
            int empexp = sc.nextInt();
            switch(Jobtype)
            {
                case 1:
                    if(empexp>=expcook && vaccook>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        vaccook--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
                case 2:
                    if(empexp>=expserver && vacserver>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        vacserver--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
            }
            break;

        }
        case 4:
        {
            System.out.println("S.No        Jobtype          Salary          Location          WorkingHours          Experience(yrs)        Vacancy");
            System.out.println("1            Photographer     50,000          Salem                 8hrs              " + expphoto +"               "+vacpho);
            System.out.println("2           Editor           30,000         Salem                  8hrs               " + expeditor +"              "+vaceditor);
            System.out.println("Enter your name : ");
		    String name = sc.next();
            System.out.println("Enter your Location : ");
		    String location = sc.next();
		    System.out.println("Enter your Mobile Number : ");
		    int mobile_No = sc.nextInt();
            System.out.println("Enter your Jobtype(S.NO) : ");
		    int Jobtype = sc.nextInt();
		    System.out.println("Enter your Experience : ");
            int empexp = sc.nextInt();
            switch(Jobtype)
            {
                case 1:
                    if(empexp>=expphoto && vacpho>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        vacpho--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
                case 2:
                    if(empexp>=expeditor && vaceditor>0)
                    {
                        System.out.println("*****************");
                        System.out.println("Job assigned to " + name);
                        vaceditor--;
                    }
                    else
                    {
                        System.out.println("*****************");
                        System.out.println("Job unavailable\n-----Better luck next time-----");
                    }
                    break;
            }
            break;
        }
    
    
        

    }
        System.out.println("Do you want to resign job(y/n)");
        char opt=sc.next().charAt(0);
        if(opt == 'y')
        {
            System.out.println("Enter your choice");
            System.out.println("-----------------------***-----------------------");
            System.out.println("1.Manager\n2.Assitant Manager\n3.Operater\n4.Technician\n5.cook\n6.Server\n7.Photographer\n8.Editor");
            System.out.println("-----------------------***-----------------------");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Your job was resigned");
                    reqdmanager++;
                    break;
                case 2:
                    System.out.println("Your job was resigned");
                    reqdasst++;
                    break;
                case 3:
                    System.out.println("Your job was resigned");
                    vacoper++;
                    break;
                case 4:
                    System.out.println("Your job was resigned");
                    vactech++;
                    break;
                case 5:
                    System.out.println("Your job was resigned");
                    vaccook++;
                    break;
                case 6:
                    System.out.println("Your job was resigned");
                    vacserver++;
                    break;
                case 7:
                    System.out.println("Your job was resigned");
                    vacpho++;
                    break;
                case 8:
                    System.out.println("Your job was resigned");
                    vaceditor++;
                    break;
            }
        }
        else
        {
            System.out.println("Thank You");
        }
  }
   
	
}
}
