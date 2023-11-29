
public class Student {
  private String name ;
  private String id;
  private String dep ;
  private int year ;
  private int semester;
  // constructor
  public Student(String name , String id , String dep , int year , int semester) {
    this.name  = name ;
    this.id  = id ;
    this.dep = dep;
    this.year = year;
    this.semester = semester;
  }  
  public Student() {
  }
  // Setters and Getters  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setId(String id) {
    this.id = id;
  }
  public void setDep(String dep) {
    this.dep = dep;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public void setSemester(int semester) {
    this.semester = semester;
  }
  public String getId() {
    return id;
  }

  public String getDep() {
    return dep;
  }

  public int getYear() {
    return year;
  }

  public int getSemester() {
    return semester;
  }

}

