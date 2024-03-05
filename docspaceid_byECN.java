// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Datum{
    public String id;
    public String customerEcn;
    public String householdId;
    public Object householdName;
    public String relationType;
    public String status;
    public ArrayList<RepCodeRelation> repCodeRelation;
    public ArrayList<int> lastUpdateDate;
    public String lastUpdateUser;
    public ArrayList<int> createdDate;
    public String createdUserId;
    public String createdUserName;
    public ArrayList<TeamMemberRelation> teamMemberRelation;
}

public class RepCodeRelation{
    public String subFirm;
    public String repCode;
    public String branch;
}

public class Root{
    public ArrayList<Datum> data;
    public Object errors;
}

public class TeamMemberRelation{
    public int index;
    public String ppid;
    public String name;
    public String employeeId;
    public Object status;
    public boolean receiveEmail;
    public boolean showToClient;
}

