
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
 * DeviceEvent
 * <p>
 * Represents IoT field device response domain events for communication support between a field device and the gateway
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "corellation_uuid",
    "ticket_uuid",
    "serv_id",
    "document_code",
    "transition"
})
public class DeviceEventResponse implements Serializable
{

    /**
     * Correlation id for ISOP SOAP Web Service Request UUID to SKC Ticket UUID mapping
     * 
     */
    @JsonProperty("corellation_uuid")
    @JsonPropertyDescription("Correlation id for ISOP SOAP Web Service Request UUID to SKC Ticket UUID mapping")
    private String corellationUuid;
    /**
     * SKC Ticket UUID
     * 
     */
    @JsonProperty("ticket_uuid")
    @JsonPropertyDescription("SKC Ticket UUID")
    private String ticketUuid;
    /**
     * EK ASUTR Service ID
     * 
     */
    @JsonProperty("serv_id")
    @JsonPropertyDescription("EK ASUTR Service ID")
    private String servId;
    /**
     * Код документа СКЦ
     * 
     */
    @JsonProperty("document_code")
    @JsonPropertyDescription("\u041a\u043e\u0434 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430 \u0421\u041a\u0426")
    private String documentCode;
    /**
     * SKC API transition value
     * 
     */
    @JsonProperty("transition")
    @JsonPropertyDescription("SKC API transition value")
    private String transition;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4417854660097865724L;

    /**
     * Correlation id for ISOP SOAP Web Service Request UUID to SKC Ticket UUID mapping
     * 
     */
    @JsonProperty("corellation_uuid")
    public String getCorellationUuid() {
        return corellationUuid;
    }

    /**
     * Correlation id for ISOP SOAP Web Service Request UUID to SKC Ticket UUID mapping
     * 
     */
    @JsonProperty("corellation_uuid")
    public void setCorellationUuid(String corellationUuid) {
        this.corellationUuid = corellationUuid;
    }

    public DeviceEventResponse withCorellationUuid(String corellationUuid) {
        this.corellationUuid = corellationUuid;
        return this;
    }

    /**
     * SKC Ticket UUID
     * 
     */
    @JsonProperty("ticket_uuid")
    public String getTicketUuid() {
        return ticketUuid;
    }

    /**
     * SKC Ticket UUID
     * 
     */
    @JsonProperty("ticket_uuid")
    public void setTicketUuid(String ticketUuid) {
        this.ticketUuid = ticketUuid;
    }

    public DeviceEventResponse withTicketUuid(String ticketUuid) {
        this.ticketUuid = ticketUuid;
        return this;
    }

    /**
     * EK ASUTR Service ID
     * 
     */
    @JsonProperty("serv_id")
    public String getServId() {
        return servId;
    }

    /**
     * EK ASUTR Service ID
     * 
     */
    @JsonProperty("serv_id")
    public void setServId(String servId) {
        this.servId = servId;
    }

    public DeviceEventResponse withServId(String servId) {
        this.servId = servId;
        return this;
    }

    /**
     * Код документа СКЦ
     * 
     */
    @JsonProperty("document_code")
    public String getDocumentCode() {
        return documentCode;
    }

    /**
     * Код документа СКЦ
     * 
     */
    @JsonProperty("document_code")
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public DeviceEventResponse withDocumentCode(String documentCode) {
        this.documentCode = documentCode;
        return this;
    }

    /**
     * SKC API transition value
     * 
     */
    @JsonProperty("transition")
    public String getTransition() {
        return transition;
    }

    /**
     * SKC API transition value
     * 
     */
    @JsonProperty("transition")
    public void setTransition(String transition) {
        this.transition = transition;
    }

    public DeviceEventResponse withTransition(String transition) {
        this.transition = transition;
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
        sb.append("corellationUuid");
        sb.append('=');
        sb.append(((this.corellationUuid == null)?"<null>":this.corellationUuid));
        sb.append(',');
        sb.append("ticketUuid");
        sb.append('=');
        sb.append(((this.ticketUuid == null)?"<null>":this.ticketUuid));
        sb.append(',');
        sb.append("servId");
        sb.append('=');
        sb.append(((this.servId == null)?"<null>":this.servId));
        sb.append(',');
        sb.append("documentCode");
        sb.append('=');
        sb.append(((this.documentCode == null)?"<null>":this.documentCode));
        sb.append(',');
        sb.append("transition");
        sb.append('=');
        sb.append(((this.transition == null)?"<null>":this.transition));
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
        result = ((result* 31)+((this.documentCode == null)? 0 :this.documentCode.hashCode()));
        result = ((result* 31)+((this.servId == null)? 0 :this.servId.hashCode()));
        result = ((result* 31)+((this.ticketUuid == null)? 0 :this.ticketUuid.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.corellationUuid == null)? 0 :this.corellationUuid.hashCode()));
        result = ((result* 31)+((this.transition == null)? 0 :this.transition.hashCode()));
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
        return (((((((this.documentCode == rhs.documentCode)||((this.documentCode!= null)&&this.documentCode.equals(rhs.documentCode)))&&((this.servId == rhs.servId)||((this.servId!= null)&&this.servId.equals(rhs.servId))))&&((this.ticketUuid == rhs.ticketUuid)||((this.ticketUuid!= null)&&this.ticketUuid.equals(rhs.ticketUuid))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.corellationUuid == rhs.corellationUuid)||((this.corellationUuid!= null)&&this.corellationUuid.equals(rhs.corellationUuid))))&&((this.transition == rhs.transition)||((this.transition!= null)&&this.transition.equals(rhs.transition))));
    }

}
