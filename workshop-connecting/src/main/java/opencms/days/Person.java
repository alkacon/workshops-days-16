
package opencms.days;

public class Person {

    private String m_name;
    private String m_firstName;
    private String m_jobDescription;
    private String m_telNumber;
    private String m_gender;

    /**
     * @param seperate
     */
    public Person(String[] seperate) {

        m_name = seperate[0];
        m_firstName = seperate[1];
        m_jobDescription = seperate[2];
        m_telNumber = seperate[3];
        m_gender = seperate[4];

    }

    /**
     * Returns the name.<p>
     *
     * @return the name
     */
    public String getName() {

        return m_name;
    }

    /**
     * Sets the name.<p>
     *
     * @param name the name to set
     */
    public void setName(String name) {

        m_name = name;
    }

    /**
     * Returns the firstName.<p>
     *
     * @return the firstName
     */
    public String getFirstName() {

        return m_firstName;
    }

    /**
     * Sets the firstName.<p>
     *
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {

        m_firstName = firstName;
    }

    /**
     * Returns the jobDescription.<p>
     *
     * @return the jobDescription
     */
    public String getJobDescription() {

        return m_jobDescription;
    }

    /**
     * Sets the jobDescription.<p>
     *
     * @param jobDescription the jobDescription to set
     */
    public void setJobDescription(String jobDescription) {

        m_jobDescription = jobDescription;
    }

    /**
     * Returns the telNumber.<p>
     *
     * @return the telNumber
     */
    public String getTelNumber() {

        return m_telNumber;
    }

    /**
     * Sets the telNumber.<p>
     *
     * @param telNumber the telNumber to set
     */
    public void setTelNumber(String telNumber) {

        m_telNumber = telNumber;
    }

    /**
     * Returns the gender.<p>
     *
     * @return the gender
     */
    public String getGender() {

        return m_gender;
    }

    /**
     * Sets the gender.<p>
     *
     * @param gender the gender to set
     */
    public void setGender(String gender) {

        m_gender = gender;
    }

}
