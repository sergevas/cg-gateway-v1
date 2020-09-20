
package dev.sergevas.cg.gateway.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DeviceEventResponse
 * <p>
 * Represents IoT field device response domain events for communication support between a field device and the gateway
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "event_id",
    "result"
})
public class DeviceEventResponse implements Serializable
{

    /**
     * The response event unique id
     * 
     */
    @JsonProperty("event_id")
    @JsonPropertyDescription("The response event unique id")
    private String eventId;
    /**
     * Device command execution result
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("Device command execution result")
    @Valid
    private Result result;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1006141232987445396L;

    /**
     * The response event unique id
     * 
     */
    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    /**
     * The response event unique id
     * 
     */
    @JsonProperty("event_id")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public DeviceEventResponse withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Device command execution result
     * 
     */
    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    /**
     * Device command execution result
     * 
     */
    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    public DeviceEventResponse withResult(Result result) {
        this.result = result;
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

    public DeviceEventResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeviceEventResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventId");
        sb.append('=');
        sb.append(((this.eventId == null)?"<null>":this.eventId));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.eventId == null)? 0 :this.eventId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceEventResponse) == false) {
            return false;
        }
        DeviceEventResponse rhs = ((DeviceEventResponse) other);
        return ((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.eventId == rhs.eventId)||((this.eventId!= null)&&this.eventId.equals(rhs.eventId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
