package com.techtacular.TourMate.Domain;

public class User {
    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(max = 50)
        private String name;

        @NotBlank
        @Size(max = 50)
        private String email;

        @NotBlank
        @Size(max = 100)
        private String password;

        // Constructors, getters, and setters
    }

}
