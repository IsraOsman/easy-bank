package com.bankproject.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold Successful response info"
)
public class ResponseDto {
    private String statusCode;
    private String statusMsg;
}
