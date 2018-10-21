package de.pinkpanther.papf.generic;

import java.util.Locale;
import java.util.ResourceBundle;

public class ApplicationHelper {

    /**
     * Name of massage resource.
     */
    private final static String LOCALISATION_BUNDLE_NAME = "messages";

    /**
     * Default locale of the system.
     */
    private final static Locale SYSTEM_LOCALE =
            new Locale(System.getProperty("user.language"), System.getProperty("user.country"));

    /**
     * Returns a localized string referred by the messagedKey.
     *
     * @param messageKey Not null
     * @return Not null.
     */
    public static String getMessage(final String messageKey) {
        return getMessage(messageKey, SYSTEM_LOCALE);
    }

    public static String getMessage(final String messageKey, final Locale locale) {

        return ResourceBundle.getBundle(LOCALISATION_BUNDLE_NAME, locale).getString(messageKey);
    }

    /**
     * Returns the default locale of the system.
     *
     * @return Not null.
     */
    public static Locale getSystemLocale() {
        return SYSTEM_LOCALE;
    }
}
