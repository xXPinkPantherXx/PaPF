package de.pinkpanther.papf.generic;

import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Helper class for everything that might be needed at any place of the application.
 */
public class ApplicationHelper {

    /**
     * Name of massage resource.
     */
    @Nonnull
    private final static String LOCALISATION_BUNDLE_NAME = "messages";

    /**
     * Default locale of the system.
     */
    @Nonnull
    private final static Locale SYSTEM_LOCALE =
            new Locale(System.getProperty("user.language"), System.getProperty("user.country"));

    /**
     * Returns a string referred by the message key for the system locale
     * from the default message bundle.
     *
     * @param messageKey Not null
     * @return Not null.
     */
    @Nonnull
    public static String getMessage(@Nonnull final String messageKey) {
        return getMessage(messageKey, SYSTEM_LOCALE);
    }

    /**
     * Returns a string referred by the message key for the given locale
     * from the default message bundle.
     *
     * @param messageKey Not null.
     * @param locale Not null.
     * @return Not null.
     */
    @Nonnull
    public static String getMessage(@Nonnull final String messageKey, @Nonnull final Locale locale) {
        Preconditions.checkNotNull(messageKey, "messageKey should not be null!");
        Preconditions.checkNotNull(locale, "locale should not be null!");

        return getMessage(LOCALISATION_BUNDLE_NAME, messageKey, locale);
    }

    /**
     * Returns a string referred by the message key for the system locale
     * from the given message bundle.
     *
     * @param bundleName Not null.
     * @param messageKey Not null.
     * @return Not null.
     */
    @Nonnull
    public static String getMessage(@Nonnull final String bundleName, @Nonnull final String messageKey) {
        Preconditions.checkNotNull(bundleName, "bundleName should not be null!");
        Preconditions.checkNotNull(messageKey, "messageKey should not be null!");

        return getMessage(bundleName, messageKey, SYSTEM_LOCALE);
    }

    /**
     * Returns a string referred by the message key for the given locale
     * from the given message bundle.
     *
     * @param bundleName Not null.
     * @param messageKey Not null.
     * @param locale Not null.
     * @return Not null.
     */
    @Nonnull
    public static String getMessage(@Nonnull final String bundleName, @Nonnull final String messageKey, @Nonnull final Locale locale) {
        Preconditions.checkNotNull(bundleName, "bundleName should not be null!");
        Preconditions.checkNotNull(messageKey, "messageKey should not be null!");
        Preconditions.checkNotNull(locale, "locale should not be null!");

        return ResourceBundle.getBundle(bundleName, locale).getString(messageKey);
    }

    /**
     * Returns the default locale of the system.
     *
     * @return Not null.
     */
    @Nonnull
    public static Locale getSystemLocale() {
        return SYSTEM_LOCALE;
    }
}
