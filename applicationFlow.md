# Application Flow


### User Sign up

1. User chooses sign up on the home page.
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates a user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Sign In

1. User chooses sign in on the home page.
1. User enters username and password on form and submits. 
1. If user is authenticated, the server will handle allowing access to edit associated entries.  JDBCRealm used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### User landing page

1. Page sends a request to view user associated data entries.
1. Servlet uses the item dao to select entries according to criteria
1. Dao performs select and creates report objects from results.
1. Dao returns list of report matching criteria to servlet.
1. Servlet sends list back to user landing jsp.

### Edit item page

1. editItem JSP displays appropriate inputs, hopefully prefilled with existing info from database using dao.
1. Servlet updates item, sends to dao.
1. Dao performs update.
1. Servlet requests updated info from database using dao.
1. Dao returns updated list to servlet.
1. Success/error given, redirect to user landing jsp with updated results


### Add Item Page

1. Option only available to logged in users with proper role
1. User directed to addItem JSP
1. User enters item details
1. Details are sent to addItem servlet
1. Servlet creates Item object
1. Servlet sends object to dao
1. Dao adds item to the database
1. Servlet sends confirmation to report page that report has been added.

### About

1. Static page - no java








 