
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
 * Device attenuator command
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "command_id",
    "params"
})
public class Command implements Serializable
{

    /**
     * Command Id
     * 
     */
    @JsonProperty("command_id")
    @JsonPropertyDescription("Command Id")
    private String commandId;
    /**
     * Command parameters list
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Command parameters list")
    @Valid
    private Params params;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7961235812671689585L;

    /**
     * Command Id
     * 
     */
    @JsonProperty("command_id")
    public String getCommandId() {
        return commandId;
    }

    /**
     * Command Id
     * 
     */
    @JsonProperty("command_id")
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public Command withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Command parameters list
     * 
     */
    @JsonProperty("params")
    public Params getParams() {
        return params;
    }

    /**
     * Command parameters list
     * 
     */
    @JsonProperty("params")
    public void setParams(Params params) {
        this.params = params;
    }

    public Command withParams(Params params) {
        this.params = params;
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

    public Command withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Command.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commandId");
        sb.append('=');
        sb.append(((this.commandId == null)?"<null>":this.commandId));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.commandId == null)? 0 :this.commandId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Command) == false) {
            return false;
        }
        Command rhs = ((Command) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.commandId == rhs.commandId)||((this.commandId!= null)&&this.commandId.equals(rhs.commandId))));
    }

}
