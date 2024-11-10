package practice.ddd.common.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    // 400 BAD_REQUEST
    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다.", "요청 파라미터 또는 형식이 올바르지 않습니다."),
    TEAM_NAME_DUPLICATE(HttpStatus.BAD_REQUEST, "팀 이름이 중복됩니다.", "이미 존재하는 팀 이름입니다."),
    EMPLOYEE_ALREADY_EXISTS(HttpStatus.BAD_REQUEST, "이미 존재하는 직원입니다.", "직원이 이미 데이터베이스에 존재합니다."),

    // 404 NOT_FOUND
    TEAM_NOT_FOUND(HttpStatus.NOT_FOUND, "팀을 찾을 수 없습니다.", "요청한 팀 ID를 찾을 수 없습니다."),
    EMPLOYEE_NOT_FOUND(HttpStatus.NOT_FOUND, "직원을 찾을 수 없습니다.", "요청한 직원 ID를 찾을 수 없습니다."),

    // 500 INTERNAL_SERVER_ERROR
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버에서 문제가 발생했습니다.", "알 수 없는 오류가 발생했습니다. 관리자에게 문의하세요.");

    private final HttpStatus httpStatus;
    private final String message;
    private final String description;

    ErrorCode(HttpStatus httpStatus, String message, String description) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.description = description;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
