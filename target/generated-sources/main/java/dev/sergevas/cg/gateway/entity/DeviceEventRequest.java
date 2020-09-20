
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
 * DeviceEventRequest
 * <p>
 * Represents IoT field device request domain event for communication support between a field device and the gateway
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "event_id",
    "device_id",
    "devcie_name",
    "topic",
    "command"
})
public class DeviceEventRequest implements Serializable
{

    /**
     * The request event unique id
     * 
     */
    @JsonProperty("event_id")
    @JsonPropertyDescription("The request event unique id")
    private String eventId;
    /**
     * The unique id of a device in the gateway context
     * 
     */
    @JsonProperty("device_id")
    @JsonPropertyDescription("The unique id of a device in the gateway context")
    private String deviceId;
    /**
     * Device name
     * 
     */
    @JsonProperty("devcie_name")
    @JsonPropertyDescription("Device name")
    private String devcieName;
    /**
     * Device request topic name
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("Device request topic name")
    private String topic;
    /**
     * Device attenuator command
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Device attenuator command")
    @Valid
    private Command command;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3300891524940543926L;

    /**
     * The request event unique id
     * 
     */
    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    /**
     * The request event unique id
     * 
     */
    @JsonProperty("event_id")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public DeviceEventRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * The unique id of a device in the gateway context
     * 
     */
    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * The unique id of a device in the gateway context
     * 
     */
    @JsonProperty("device_id")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public DeviceEventRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Device name
     * 
     */
    @JsonProperty("devcie_name")
    public String getDevcieName() {
        return devcieName;
    }

    /**
     * Device name
     * 
     */
    @JsonProperty("devcie_name")
    public void setDevcieName(String devcieName) {
        this.devcieName = devcieName;
    }

    public DeviceEventRequest withDevcieName(String devcieName) {
        this.devcieName = devcieName;
        return this;
    }

    /**
     * Device request topic name
     * 
     */
    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    /**
     * Device request topic name
     * 
     */
    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DeviceEventRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Device attenuator command
     * 
     */
    @JsonProperty("command")
    public Command getCommand() {
        return command;
    }

    /**
     * Device attenuator command
     * 
     */
    @JsonProperty("command")
    public void setCommand(Command command) {
        this.command = command;
    }

    public DeviceEventRequest withCommand(Command command) {
        this.command = command;
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

    public DeviceEventRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeviceEventRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventId");
        sb.append('=');
        sb.append(((this.eventId == null)?"<null>":this.eventId));
        sb.append(',');
        sb.append("deviceId");
        sb.append('=');
        sb.append(((this.deviceId == null)?"<null>":this.deviceId));
        sb.append(',');
        sb.append("devcieName");
        sb.append('=');
        sb.append(((this.devcieName == null)?"<null>":this.devcieName));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("command");
        sb.append('=');
        sb.append(((this.command == null)?"<null>":this.command));
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
        result = ((result* 31)+((this.eventId == null)? 0 :this.eventId.hashCode()));
        result = ((result* 31)+((this.devcieName == null)? 0 :this.devcieName.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.deviceId == null)? 0 :this.deviceId.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceEventRequest) == false) {
            return false;
        }
        DeviceEventRequest rhs = ((DeviceEventRequest) other);
        return (((((((this.eventId == rhs.eventId)||((this.eventId!= null)&&this.eventId.equals(rhs.eventId)))&&((this.devcieName == rhs.devcieName)||((this.devcieName!= null)&&this.devcieName.equals(rhs.devcieName))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.deviceId == rhs.deviceId)||((this.deviceId!= null)&&this.deviceId.equals(rhs.deviceId))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))));
    }

}
