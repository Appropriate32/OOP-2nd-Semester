public class Lab {
    public static int counter = 0;
    public static String ID_PREFIX = "LAB-";

    private int id;
    private String universityName;
    private String departmentName;
    private String sectionName;
    private String labName;
    private int totalComputers;
    private int bookedComputers;
    private Date labDate;

    public Lab(int id, String universityName, String departmentName, String sectionName, String labName, int totalComputers, int bookedComputers, Date labDate) {
        this.id = id;
        this.universityName = universityName;
        this.departmentName = departmentName;
        this.sectionName = sectionName;
        this.labName = labName;                          // Full constructor
        this.totalComputers = totalComputers;
        this.bookedComputers = bookedComputers;
        this.labDate = new Date(labDate);
        counter++;
    }

    public Lab() { // Default constructor
        this(00, "Default University", "Default Department", "Default Section", "Default Lab", 0, 0, new Date());
    }

    public Lab(int id) { // One-parameter constructor
        this(id, "Default University", "Default Department", "Default Section", "Default Lab", 0, 0, new Date());
    }

    public Lab(int id, String universityName) { // Two-parameter constructor
        this(id, universityName, "Default Department", "Default Section", "Default Lab", 0, 0, new Date());
    }

    public Lab(int id, String universityName, Date otherDate) { // Three-parameter constructor
        this(id, universityName, "Default Department", "Default Section", "Default Lab", 0, 0, new Date(otherDate));
    }

    public Lab(Lab other) { // Copy constructor
        this(other.getId(), other.getUniversityName(), other.getDepartmentName(), other.getSectionName(), other.getLabName(), other.getTotalComputers(), other.getBookedComputers(), other.getLabDate());
    }

    public static int getInstanceCount() {
        return counter;
    }

    public void bookComputers(int count) {
        this.bookedComputers = count;
    }

    private String generateUniqueId() {
        return ID_PREFIX + String.format("%03d", id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabName() {
        return labName;
    }

    public void setTotalComputers(int totalComputers) {
        this.totalComputers = totalComputers;
    } 

    public int getTotalComputers() {
        return totalComputers;
    }

    public void setBookedComputers(int bookedComputers) {
        this.bookedComputers = bookedComputers;
    }

    public int getBookedComputers() {
        return bookedComputers;
    }

    public void setLabDate(Date labDate) {
        this.labDate = new Date(labDate);
    }

    public Date getLabDate() {
        return labDate;
    }
}