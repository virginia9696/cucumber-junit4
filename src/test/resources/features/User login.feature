@Login
Feature: Log in functionality
  As a user,
  I want to be able to log in successfully with valid credentials,
  So that I can use the system with the appropriate permissions.

  1. Users must be able to log in to the system with valid credentials.
  2. On successful login:
  If the user is an admin, they should see the message:
  "Hello Admin, you have rights to edit, view and read"
  If the user is a regular user, they should see the message:
  "Hello <username>, you have rights to view and read"
  3. This story covers testing with both admin and regular user logins.
  4. Admin and regular user login pages have different URLs/links and should be accessed separately.

  Test Credentials:
  admin       : username - admin,             password - helloAmore123
  regular user: username - "some valid name", password - helloYou123

  @Login @Positive
  Scenario Outline: Successful login for <user> user
    Given '<admin>' login page is displayed
    When user inserts valid <username> and <password>
    Then user is successfully logged in
    And successful <message> is displayed

    Examples:
      | user    | admin                          | username | password      | message                                             |
      | admin   | https://site/login/admin.com   | admin    | helloAmore123 | Hello Admin, you have rights to edit, view and read |
      | regular | https://site/login/regular.com | Alice    | helloYou123   | Hello Alice, you have rights to view and read       |