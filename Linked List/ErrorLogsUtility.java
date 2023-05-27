/*
 * @description This is a Utility class for Error Logs/ frameworks/ re-using error messages etc.
 * Createdby      CreatedDate       Version
 * Subhadeep      24May2023         <first>
 */
public class ErrorLogsUtility {
    public String className;
    public String module;
    final static String GENERIC_ERROR_MESSAGE = "Opps! Something went wrong";
    final static String EMPTY_LIST = "Opps! Empty Linked List";
    final static String NOT_FOUND = "Opps! Data not found in the list";
    public ErrorLogsUtility(String className, String module) {
        this.className = className;
        this.module = module;
    }
    
    /*Log with a generic error message */
    public void doLog() {
        System.out.println(this.className+"|"+this.module+"|"+GENERIC_ERROR_MESSAGE);
    }
    /*Log with a custom error message e.g. - Array Index Out of Bound etc.*/
    public void doLog(String customMessage) {
        System.out.println(this.className+"|"+this.module+"|"+customMessage);
    }
}
