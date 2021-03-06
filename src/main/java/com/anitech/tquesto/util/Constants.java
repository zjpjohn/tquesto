package com.anitech.tquesto.util;

/**
 * @author Tapas
 *
 */
public class Constants {

    //Regex for few acceptable values
    public static final String USER_NAME_REGEX = "^[_'.@A-Za-z0-9-]*$";
    public static final String APP_NAME_REGEX = "^[_A-Za-z0-9-]*$";
    
    // Spring profile for development and production, see http://jhipster.github.io/profiles/
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    
    // Auth
    public static final String AUTH_SECURITY_CONTEXT = "/api/**";
    
    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";
    
    public static final String SYSTEM_ACCOUNT = "system";
    
}
