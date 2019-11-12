public class HelloWorld {

  # Code taken from https://shitcode.net/worst/language/java
  public static MyClass {
      private static volatile ProcessManager singleton = null;
      
      public static ProcessManager getInstance() throws Exception {
          if (singleton == null) {
              synchronized (MyClass.class) {
                  if (singleton == null) {
                      singleton = new ProcessManager();
                  }
              }
          }
          return singleton;
      }
  }

  public void sleep(long duration) {
      long start = System.currentTimeMillis();
      while(true) {
          if (System.currentTimeMillis() - start >= duration)
              break;
      }
  }

  public static returnTrue(boolean b){
      if (b){
          return true;
      } else {
          return true;
      }
  }
    
  private HashMap<String, Tuple6<float[], String[], String[], String[], String[], String>> memberNameChangedToProtectTheInnocent = null;

  public String toString() {
      List<Integer> accountLevels = new ArrayList<>();
      List<String> accountIds = new ArrayList<>();

      for (SelectedHierarchyLevel selectedHierarchyLevel : selectedHierarchyLevels) {
          accountLevels.add(selectedHierarchyLevel.getLevel());
          accountIds.add(selectedHierarchyLevel.getAccountRowId());
      }

      vetoAreValidIds(accountIds);
      StringBuilder converterString = new StringBuilder();

      convert(accountLevels, converterString);
      converterString.append("$");
      convert(accountIds, converterString);

      return converterString.toString();
  }
  
  public class MandateData {

    public final UUID coreId;
    public final UUID accountId;
    public final String accountRef;
    public final String creditorId;
    public final String creditorName;
    public final String debtorFirstName;
    public final String debtorLastName;
    public final String branchCode;
    public final String accountNumber;
    public final LocalDate signingDate;
    public final Address debtorAddress;

    private MandateData(UUID coreId, UUID accountId, String accountRef, String creditorId, String creditorName, String branchCode, String accountNumber, String debtorFirstName, String debtorLastName,
                        LocalDate signingDate, Address debtorAddress) {
        this.coreId = coreId;
        this.accountId = accountId;
        this.accountRef = accountRef;
        this.creditorId = creditorId;
        this.creditorName = creditorName;
        this.debtorFirstName = debtorFirstName;
        this.debtorLastName = debtorLastName;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
        this.signingDate = signingDate;
        this.debtorAddress = debtorAddress;
    }

    public static MandateData creationMandateData(UUID coreId, UUID accountId, String accountRef, String creditorId, String creditorName, String branchCode, String accountNumber, String debtorFirstName, String debtorLastName,
                                                  LocalDate signingDate, Address debtorAddress) {
        return new MandateData(coreId, accountId, accountRef, creditorId, creditorName, branchCode, accountNumber, debtorFirstName, debtorLastName, signingDate, debtorAddress);
    }  
  
  public static void main(String[] args) {
      // Prints "Hello, World" to the terminal window.
      System.out.println("Hello, World");
  }
}
