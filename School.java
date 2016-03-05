import java.util.Scanner;

public class School {
	private String schoolname;
	private int id;
    private String name;
    private String address;
    private String phno;
    private int age;
    private String pincode;
    private double englishmarks;
    private double mathsmarks;
    private double sciencemarks;
    private double totalmarks;
    private double percentage;
    private String grade;    
    Scanner scan = new Scanner(System.in);
    
    School()
    {
    	this.schoolname = "Ducat";
    }

	public void setId(int id) {
		id=scan.nextInt();
		if(id<0||id>100)
		this.id = id;
		else
			System.out.println("Invalid id");
	}
	public void setName(String name) {
		name=scan.nextLine();
		if(name.length()>1||name.length()<20)
		this.name = name;
		else
			System.out.println("Enter name of length 20");
	}

	public void setAddress(String address) {
		address=scan.nextLine();
		this.address = address;
	}

	public void setPhno(String phno) {
		phno=scan.next();
		this.phno = phno;
	}

	public void setAge(int age) {
		age=scan.nextInt();
		this.age = age;
	}

	public void setPincode(String pincode) {
		pincode=scan.next();
		this.pincode = pincode;
	}

	public void setEnglishmarks(double englishmarks) {
		englishmarks=scan.nextDouble();
		if(englishmarks<0||englishmarks>100)
			System.out.println("Invalid marks");
		else
			this.englishmarks = englishmarks;
	}

	public void setMathsmarks(double mathsmarks) {
		if(mathsmarks<0||mathsmarks>100)
			System.out.println("Invalid marks");
		else 
		this.mathsmarks = mathsmarks;
	}

	public void setSciencemarks(double sciencemarks) {
		if(sciencemarks<0||sciencemarks>100)
			System.out.println("Invalid marks");
		else
		this.sciencemarks = sciencemarks;
	}

	public void setTotalmarks(double totalmarks) {
		totalmarks=sciencemarks+mathsmarks+englishmarks;
		this.totalmarks = totalmarks;
	}

	public void setPercentage(double percentage) {
        percentage=totalmarks/3;
		this.percentage = percentage;
	}

	public void setGrade(String grade) {
		if(percentage>90)
			grade="A+";
		if(percentage>80&&percentage<90)
			grade="A";
		if(percentage>70&&percentage<80)
			grade="B+";
		if(percentage>60&&percentage<70)
			grade="B";
		this.grade = grade;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhno() {
		return phno;
	}

	public int getAge() {
		return age;
	}

	public String getPincode() {
		return pincode;
	}

	public double getEnglishmarks() {
		return englishmarks;
	}

	public double getMathsmarks() {
		return mathsmarks;
	}

	public double getSciencemarks() {
		return sciencemarks;
	}

	public double getTotalmarks() {
		return totalmarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade() {
		return grade;
	}
	
    }
