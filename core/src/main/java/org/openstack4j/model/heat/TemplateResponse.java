package org.openstack4j.model.heat;

import com.google.common.base.MoreObjects;

/**
 * Response returned during Template validation
 *
 * @author Jeremy Unruh
 */
public final class TemplateResponse {

    private String message;

    private  boolean isValid;

    private TemplateResponse() { }

    private TemplateResponse(String message) {
        this.message = message;
    }
    private TemplateResponse(boolean isValid) {
        this.isValid = isValid;
    }
    private TemplateResponse(boolean isValid , String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public static TemplateResponse success() {
        return new TemplateResponse(true);
    }

    public static TemplateResponse success(boolean isValid ) {
        return new TemplateResponse(isValid );
    }

    public static TemplateResponse success(boolean isValid , String message) {
        return new TemplateResponse(isValid , message);
    }

    public static TemplateResponse success(String message) {
        return new TemplateResponse(true,message);
    }
    public static TemplateResponse fail(String message) {
        return new TemplateResponse(false,message);
    }

    /**
     * True if the template validation was successful
     *
     * @return true if successful
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * The Error message that occurred during validation.
     *
     * @return the error message, will be a TemplateValidate object if {@link #isValid()} is true
     */
    public String getMessage() {
        return message;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues().add("valid", isValid).add("message", message).toString();
    }
}
