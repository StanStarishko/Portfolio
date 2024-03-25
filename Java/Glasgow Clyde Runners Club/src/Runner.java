public class Runner {
    protected String fullName;
    protected String firstName;
    protected String secondName;
    protected Long timeSeconds;

    public String getFullName() {
        return this.fullName;
    }

    public Long getTimeSeconds() {
        return this.timeSeconds;
    }

    public void setFullName() {
        this.fullName = this.firstName + " " + this.secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setTimeSeconds(Long timeSeconds) {
        this.timeSeconds = timeSeconds;
    }
}
