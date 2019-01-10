package org.openstack4j.openstack.heat.internal;
import com.fasterxml.jackson.annotation.*;
import org.openstack4j.openstack.heat.domain.HeatTemplate;

import java.util.*;

/**
 * This class is JavaBean for  Template validate' result
 * objects. The non-exhaustive list of methods is oriented along
 * http://developer.openstack.org/api-ref-orchestration-v1.html#stack-templates
 *
 *
 * @author Robin Chia
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TemplateValidate {
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Parameters")
    private Map<String,Map<String,String>> Parameters = new LinkedHashMap<>();
    @JsonProperty("ParameterGroups")
    private Map<String,Map<String,String>> ParameterGroups = new LinkedHashMap<>();

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
    @JsonGetter
    public Map<String, Map<String,String>> getParameters() {
        return Parameters;
    }

    @JsonSetter
    public void setParameters(Map<String, Map<String,String>> parameters) {
        Parameters = parameters;
    }
    @JsonGetter
    public Map<String, Map<String,String>> getParameterGroups() {
        return ParameterGroups;
    }
    @JsonSetter
    public void setParameterGroups(Map<String, Map<String,String>> parameterGroups) {
        ParameterGroups = parameterGroups;
    }
    @JsonGetter
    public Map<String, Map<String,String>> getEnvironment() {
        return Environment;
    }
    @JsonSetter
    public void setEnvironment(Map<String, Map<String,String>> environment) {
        Environment = environment;
    }
    @JsonProperty("Environment")
    private Map<String,Map<String,String>> Environment = new LinkedHashMap<>();

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(" {")
                .append("\"Description\": \"");
        if(Description!=null)  stringBuilder.append(Description).append("\"");
        stringBuilder.append(", ").append("\n")
                .append(",\"Parameters\": {");
        if(Parameters!=null)
            forMap(stringBuilder,Parameters);

        stringBuilder.append("}\n");
        stringBuilder.append(", \"ParameterGroups\": {");
        if(ParameterGroups!=null)
            forMap(stringBuilder,ParameterGroups);
        stringBuilder.append("}\n");
        stringBuilder.append(", \"Environment\": {");
        if(Environment!=null) forMap(stringBuilder,Environment);
        stringBuilder.append("}\n");
        stringBuilder.append(" }");

        return stringBuilder.toString();
    }

    protected static void forMap(StringBuilder stringBuilder, Map<String, Map<String,String>> map) {
        for (Map.Entry<String, Map<String,String>> entry : map.entrySet()) {
            stringBuilder.append("\"").append(entry.getKey()).append("\": {");
            stringBuilder.append(transMapToString(entry.getValue()));
            stringBuilder.append("}\n");
        }
    }

    protected static String transMapToString(Map map) {
        java.util.Map.Entry entry;
        StringBuffer sb = new StringBuffer();
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            entry = (java.util.Map.Entry) iterator.next();
            sb.append("\"").append(entry.getKey().toString()).append("\"").append(": \"").append(null == entry.getValue() ? "" :
                    entry.getValue().toString()).append("\"").append(iterator.hasNext() ? "," : "");
        }
        return sb.toString();
    }

}
