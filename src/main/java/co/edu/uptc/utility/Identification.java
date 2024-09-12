package co.edu.uptc.utility;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identification{
        @JsonProperty("Originator") 
        public String originator;
        @JsonProperty("Metadata Language") 
        public String metadataLanguage;
    }
  
