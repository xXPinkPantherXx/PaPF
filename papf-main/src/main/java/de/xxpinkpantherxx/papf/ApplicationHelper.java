package de.xxpinkpantherxx.papf;

import java.util.Locale;
import java.util.ResourceBundle;

public class ApplicationHelper {

    /**
     * Name of massage resource.
     */
    private final static String MESSAGES_BUNDLE_NAME = "messages";

    /**
     * Default locale of the system.
     */
    private final static Locale SYSTEM_LOCALE =
            new Locale(System.getProperty("user.language"), System.getProperty("user.country"));

    /**
     * ResourceBundle for internationalization.
     */
    private final static ResourceBundle MESSAGE_BUNDLE =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, SYSTEM_LOCALE);

    /**
     * Returns a localized string referred by the messagedKey.
     *
     * @param messageKey Not null
     * @return Not null.
     */
    public static String getMessage(final String messageKey) {
        return MESSAGE_BUNDLE.getString(messageKey);
    }
}
