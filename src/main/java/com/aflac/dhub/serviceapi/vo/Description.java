package com.aflac.dhub.serviceapi.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/*import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder; */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "context",
        "long-description",
        "short-description",
        "type"
})
public class Description implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("context")
    private String context;
    @JsonProperty("long-description")
    private String longDescription;
    @JsonProperty("short-description")
    private String shortDescription;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 84733965676232475L;

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Description withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    public Description withContext(String context) {
        this.context = context;
        return this;
    }

    @JsonProperty("long-description")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("long-description")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Description withLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    @JsonProperty("short-description")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("short-description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Description withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Description withType(String type) {
        this.type = type;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Description withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    /* @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("context", context).append("longDescription", longDescription).append("shortDescription", shortDescription).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

      @Override
    public int hashCode() {
        return new HashCodeBuilder().append(longDescription).append(code).append(context).append(shortDescription).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Description) == false) {
            return false;
        }
        Description rhs = ((Description) other);
        return new EqualsBuilder().append(longDescription, rhs.longDescription).append(code, rhs.code).append(context, rhs.context).append(shortDescription, rhs.shortDescription).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    } */

}
