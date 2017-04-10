package guestbook

class Feedback {

    String title
    String feedback
    Date dateCreated
    Date lastUpdated

    // Relationship to other classes
    User user
    Set comments = []
    static hasMany=[comments:Comment]

    static constraints = {
        title (blank: false, nullable: false, size:3..80)
        feedback (blank: false, nullable: false, size:3..500)
        user (nullable: false)
    }
}