package com.example.abc;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Long customerId;
    private String name;
    private String emailId;
}
