package stepdefinitions;

public class schedule {
    private String id;
    private String description;
    public schedule(String id2, String description2) {
		// TODO Auto-generated constructor stub
    	 this.id = id;
         this.description = description;
	}

	// Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

