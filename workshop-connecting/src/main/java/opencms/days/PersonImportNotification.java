
package opencms.days;

import org.opencms.file.CmsObject;
import org.opencms.file.CmsUser;
import org.opencms.notification.A_CmsNotification;

/**
 * Class to send a notification to an OpenCms user with a summary of warnings and
 * errors occurred while importing the person information from cvs.<p>
 */
public class PersonImportNotification extends A_CmsNotification {

    /** The path to the xml content with the subject, header and footer of the notification e-mail.<p> */
    public static final String NOTIFICATION_CONTENT = "";

    /**
     * Default constructor.<p>
     * 
     * @param cms the cms object to use
     * @param receiver the notification receiver
     */
    public PersonImportNotification(CmsObject cms, CmsUser receiver) {

        super(cms, receiver);
    }

    /**
     * @see org.opencms.notification.A_CmsNotification#generateHtmlMsg()
     */
    @Override
    protected String generateHtmlMsg() {

        return html;

    }

    /**
     * @see org.opencms.notification.A_CmsNotification#getNotificationContent()
     */
    @Override
    protected String getNotificationContent() {

        return NOTIFICATION_CONTENT;
    }
}
