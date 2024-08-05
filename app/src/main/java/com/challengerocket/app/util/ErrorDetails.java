package com.challengerocket.app.util;
import lombok.*;

import java.util.Date;
/**
 *  error details
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDetails {
    private Date marcaDate;
    private String errorMessage;
    private String description;
}

