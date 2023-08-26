package faang.school.notificationservice.message;

import java.util.Locale;

public interface MessageBuilder<T> {

    String buildMessage(T event, Locale locale, User );

    Class<?> supportsEventType();
}

