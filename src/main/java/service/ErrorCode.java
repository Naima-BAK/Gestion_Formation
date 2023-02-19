package service;

public enum ErrorCode {
    /* SYS */
    /**
     * General System Error
     */
    ERR_SYS_GENERAL(1000, "General Error occured"),
    /**
     * Invalid Method Invocation
     */
    ERR_SYS_INVALID_INVOCATION(1001, "Invalid Method Invocation"),
    /**
     * Application Warning: bean validation error
     */
    APP_WARN_BEAN_VALIDATION_ERROR(2000, "Bean validation error."),
    /**
     * Permission denied
     */
    APP_WARN_PERMISSION_DENIED(1002, "Permission denied"),
    /**
     * GD Search Limit exceeded
     */
    APP_WARN_GD_SEARCH_SIZE_LIMIT_EXCEEDED(1003, "GD Search Limit exceeded"),
    /**
     * GD Search error occured
     */
    ERR_SYS_GD_SEARCH(1004, "GD Search error occured"),
    /**
     * User already exists
     */
    APP_WARN_USER_ALREADY_EXISTS(1005, "User already exists"),
    /**
     * Upload temporary directory not found
     */
    ERR_UPLOAD_TEMP_NOT_FOUND(1006, "Upload temporary directory not found"),
    /**
     * Upload exe-files not allowed
     */
    ERR_UPLOAD_EXE_NOT_ALLOWED(1007, "Upload exe-files not allowed"),
    /**
     * moduleOrg already exist
     */
    APP_WARN_MODULE_ORG_ALREADY_EXIST(1008, "ModuleOrg already exist"),
    /**
     * moduleOrg name contain only letters
     */
    APP_WARN_MODULE_ORG_ONLY_LETTERS(1009, "ModuleOrg name contain only letters"),
    /**
     * moduleOrg name contain only 2 letters
     */
    APP_WARN_MODULE_ORG_2_LETTERS(1010, "ModuleOrg name contain only 2 letters"),
    /**
     * Workshop title is empty
     */
    APP_WARN_WORKSHOP_TITLE_EMPTY(1011, "Workshop title is empty"),
    /**
     * Workshop leader is empty
     */
    APP_WARN_WORKSHOP_LEADER_EMPTY(1012, "Workshop leader is empty"),
    /**
     * Upload file size exceeded
     */
    ERR_UPLOAD_MAX_FILE_SIZE_EXCEEDED(1013, "Upload file size exceeded"),
    /**
     * Upload file size exceeded
     */
    ERR_DIMENSION_NOT_IDENTIQUE(1014, "The Dimension of picture  not equal 465 * 173"),
    /**
     * The Model type is mandatory field"
     */
    ERR_MODEL_TYPE_IS_MANDATORY_FIELD(1015, "The Model type is mandatory field"),
    /**
     * The Vehicle image is mandatory field
     */
    ERR_VEHICLE_IMAGE_IS_MANDATORY_FIELD(1016, "The Vehicle image is mandatory field"),
    /**
     * Boole invalid character
     */
    APP_WARN_BOOLE_INVALID_CHAR(1014, "Boole invalid character"),
    /**
     * Boole invalid dimension
     */
    APP_WARN_BOOLE_INVALID_DIMENSION(1015, "Boole invalid dimension"),
    /**
     * Boole invalid dimension
     */
    APP_WARN_BOOLE_UNSUPPORTED_DIMENSION(1016, "Boole unsupported dimension"),
    /**
     * Boole invalid syntax
     */
    APP_WARN_BOOLE_INVALID_SYNTAX(1017, "Boole invalid syntax"),
    /**
     * Part with empty department
     */
    APP_WARN_PART_EMPTY_DEPARTMENT(1018, "Part with empty department"),
    /**
     * Part with empty modulOrg
     */
    APP_WARN_PART_EMPTY_MODUL_ORG(1019, "Part with empty modulOrg"),
    /**
     * Part with invalid modulOrg
     */
    APP_WARN_PART_INVALID_MODUL_ORG(1020, "Part with invalid modulOrg"),
    /**
     * Part with empty KoGr
     */
    APP_WARN_PART_EMPTY_KO_GR(1021, "Part with empty KoGr"),
    /**
     * Part with invalid KoGr
     */
    APP_WARN_PART_INVALID_KO_GR(1022, "Part with invalid KoGr"),
    /**
     * Part with empty material
     */
    APP_WARN_PART_EMPTY_MATERIAL_NUMBER(1023, "Part with empty material"),
    /**
     * Part with invalid material
     */
    APP_WARN_PART_INVALID_MATERIAL_NUMBER(1024, "Part with invalid material"),
    /**
     * Part with empty AI
     */
    APP_WARN_PART_EMPTY_MATERIAL_AI(1038, "Part with empty material ai"),
    /**
     * Part with invalid AI
     */
    APP_WARN_PART_INVALID_MATERIAL_AI(1025, "Part with invalid AI"),
    /**
     * Part with empty material text
     */
    APP_WARN_PART_EMPTY_MATERIAL_TEXT(1026, "Part with empty material text"),
    /**
     * Part with empty KIEVFA
     */
    APP_WARN_PART_EMPTY_KIEVFA(1027, "Part with empty KIEVFA"),
    /**
     * Part with empty count
     */
    APP_WARN_PART_EMPTY_COUNT(1028, "Part with empty count"),
    /**
     * Part with empty action
     */
    APP_WARN_PART_EMPTY_ACTION(1029, "Part with empty action"),
    /**
     * Part with empty type
     */
    APP_WARN_PART_EMPTY_TYPE(1030, "Part with empty type"),
    /**
     * Part with empty boole
     */
    APP_WARN_PART_EMPTY_BOOLE(1031, "Part with empty boole"),
    /**
     * Label empty name
     */
    APP_WARN_LABEL_EMPTY_NAME(1032, "Label empty name"),
    /**
     * Label name already exists
     */
    APP_WARN_LABEL_NAME_ALREADY_EXISTS(1033, "Label name already exists"),
    /**
     * GD Search no result found
     */
    APP_WARN_GD_SEARCH_NO_RESULT(1034, "GD Search no result found"),
    /**
     * Part with empty dmgs
     */
    APP_WARN_PART_EMPTY_DMGS(1035, "Part with empty dmgs"),
    /**
     * Workshop title is empty
     */
    APP_WARN_PROJECT_TITLE_EMPTY(1011, "Project title is empty"),
    /**
     *
     */
    APP_WARN_PROJECT_IS_FREEZE(1036, "Project is freeze "),

    /**
     * Please fill all required fields
     */
    ERR_LINKLIST_MANDATORY_FIELD_MISSING(1016, "Please fill all required fields"),
    /**
     * invalid format of link
     */
    ERR_LINKLIST_INVALID_FORMAT(1037, "The link has invalid format"),
    /**
     *
     */
    APP_WARN_SNAPSHOT_LABEL_ALREADY_EXIST(1039, "Snapshot label already exist"),
    /**
     *
     */
    APP_WARN_SNAPSHOT_LABEL_CANNOT_BE_EMPTY(1040, "Snapshot label cannot be empty"),
    /**
     *
     */
    APP_WARN_ASSEMBLY_HINT_DESCRIPTION_CANNOT_BE_EMPTY(1041, "Assembly Hint Description cannot be empty"),
    /**
     * Part with invalid PPG
     */
    APP_WARN_PART_INVALID_PPG(1042, "Part with invalid PPG"),
    /**
     * Uploaded file has bad header
     */
    ERR_UPLOAD_BAD_HEADER(1043, "Upload file has bad header");

    private final int id;
    private final String description;

    /**
     * @param id
     */
    private ErrorCode(final int id, final String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return error code as json string
     */
    public String toJson() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"errCode\":");
        sb.append("\"");
        sb.append(this.name());
        sb.append("\",");
        sb.append("\"errId\":");
        sb.append("\"");
        sb.append(this.id);
        sb.append("\"");
        sb.append("}");
        return sb.toString();
    }

}
