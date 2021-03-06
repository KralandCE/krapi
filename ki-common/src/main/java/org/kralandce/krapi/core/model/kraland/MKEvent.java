package org.kralandce.krapi.core.model.kraland;

import java.time.LocalDateTime;

import static com.google.common.base.Preconditions.checkNotNull;

public final class MKEvent {
    private MKEvent() {

    }

    public static final class Type {
        private final String type;

        private Type(String eventType) {
            this.type = checkNotNull(eventType);
        }

        public static Type of(String eventType) {
            return new Type(eventType);
        }

        public String asString() {
            return this.type;
        }

        @Override
        public boolean equals(Object o) {
            if( this == o ) return true;
            if( o == null || getClass() != o.getClass() ) return false;

            Type text1 = (Type) o;

            return this.type.equals(text1.type);
        }

        @Override
        public int hashCode() {
            return this.type.hashCode();
        }
    }

    public static final class Content {
        private final String content;

        private Content(String eventContent) {
            this.content = checkNotNull(eventContent);
        }

        public static Content of(String eventContent) {
            return new Content(eventContent);
        }

        public String asString() {
            return this.content;
        }

        @Override
        public boolean equals(Object o) {
            if( this == o ) return true;
            if( o == null || getClass() != o.getClass() ) return false;

            Content text1 = (Content) o;

            return this.content.equals(text1.content);
        }

        @Override
        public int hashCode() {
            return this.content.hashCode();
        }
    }

    public static final class Date {
        private final LocalDateTime date;

        private Date(LocalDateTime eventDate) {
            this.date = checkNotNull(eventDate);
        }

        public static Date of(LocalDateTime eventDate) {
            return new Date(eventDate);
        }

        public LocalDateTime asLocalDateTime() {
            return this.date;
        }

        @Override
        public boolean equals(Object o) {
            if( this == o ) return true;
            if( o == null || getClass() != o.getClass() ) return false;

            Date date1 = (Date) o;

            return this.date.equals(date1.date);
        }

        @Override
        public int hashCode() {
            return this.date.hashCode();
        }
    }
}
