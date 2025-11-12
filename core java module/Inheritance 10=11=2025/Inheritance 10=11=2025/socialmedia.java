class SocialMediaAccount {
    String username;
    boolean isPublic;
    String countryOfOrigin;
    int noOfPosts;
    int noOfLikes;
    int noOfComments;
    String createdAt;
    int impressions;
    static int count = 0;

    // Default Constructor
    SocialMediaAccount() {
        System.out.println("Default constructor of SocialMediaAccount called");
        this.username = "Unknown";
        this.isPublic = true;
        this.countryOfOrigin = "Unknown";
        this.noOfPosts = 0;
        this.noOfLikes = 0;
        this.noOfComments = 0;
        this.createdAt = "2020-01-01";
        this.impressions = 0;
        count++;
    }

    // Parameterized Constructor
    SocialMediaAccount(String username, boolean isPublic, String countryOfOrigin,
                       int noOfPosts, int noOfLikes, int noOfComments,
                       String createdAt, int impressions) {
        System.out.println("Parameterized constructor of SocialMediaAccount called");
        this.username = username;
        this.isPublic = isPublic;
        this.countryOfOrigin = countryOfOrigin;
        this.noOfPosts = noOfPosts;
        this.noOfLikes = noOfLikes;
        this.noOfComments = noOfComments;
        this.createdAt = createdAt;
        this.impressions = impressions;
        count++;
    }

    // Getters and Setters
    void setUsername(String username) { this.username = username; }
    String getUsername() { return this.username; }

    void setIsPublic(boolean isPublic) { this.isPublic = isPublic; }
    boolean getIsPublic() { return this.isPublic; }

    void setCountryOfOrigin(String country) { this.countryOfOrigin = country; }
    String getCountryOfOrigin() { return this.countryOfOrigin; }

    void setNoOfPosts(int posts) { this.noOfPosts = posts; }
    int getNoOfPosts() { return this.noOfPosts; }

    void setNoOfLikes(int likes) { this.noOfLikes = likes; }
    int getNoOfLikes() { return this.noOfLikes; }

    void setNoOfComments(int comments) { this.noOfComments = comments; }
    int getNoOfComments() { return this.noOfComments; }

    void setCreatedAt(String date) { this.createdAt = date; }
    String getCreatedAt() { return this.createdAt; }

    void setImpressions(int imp) { this.impressions = imp; }
    int getImpressions() { return this.impressions; }

    static int getCount() { return count; }

    void display() {
        System.out.println("\n--- Social Media Account Details ---");
        System.out.println("Username: " + this.username);
        System.out.println("Public: " + this.isPublic);
        System.out.println("Country: " + this.countryOfOrigin);
        System.out.println("Posts: " + this.noOfPosts);
        System.out.println("Likes: " + this.noOfLikes);
        System.out.println("Comments: " + this.noOfComments);
        System.out.println("Created At: " + this.createdAt);
        System.out.println("Impressions: " + this.impressions);
    }
}


// Instagram subclass
class InstagramAccount extends SocialMediaAccount {
    int followers;
    int following;
    int highlights;
    int postsArchived;
    int storiesArchived;
    int audiosSaved;

    InstagramAccount() {
        super();
        this.followers = 1000;
        this.following = 500;
        this.highlights = 5;
        this.postsArchived = 10;
        this.storiesArchived = 3;
        this.audiosSaved = 2;
        System.out.println("Default constructor of InstagramAccount called");
    }

    InstagramAccount(String username, boolean isPublic, String country, int posts, int likes, int comments, String createdAt, int impressions,
                     int followers, int following, int highlights, int postsArchived, int storiesArchived, int audiosSaved) {
        super(username, isPublic, country, posts, likes, comments, createdAt, impressions);
        this.followers = followers;
        this.following = following;
        this.highlights = highlights;
        this.postsArchived = postsArchived;
        this.storiesArchived = storiesArchived;
        this.audiosSaved = audiosSaved;
        System.out.println("Parameterized constructor of InstagramAccount called");
    }

    void display() {
        super.display();
        System.out.println("Followers: " + this.followers);
        System.out.println("Following: " + this.following);
        System.out.println("Highlights: " + this.highlights);
        System.out.println("Posts Archived: " + this.postsArchived);
        System.out.println("Stories Archived: " + this.storiesArchived);
        System.out.println("Audios Saved: " + this.audiosSaved);
    }
}


// LinkedIn subclass
class LinkedInAccount extends SocialMediaAccount {
    int connections;
    int profileViews;
    int jobsApplied;

    LinkedInAccount() {
        super();
        this.connections = 300;
        this.profileViews = 500;
        this.jobsApplied = 20;
        System.out.println("Default constructor of LinkedInAccount called");
    }

    LinkedInAccount(String username, boolean isPublic, String country, int posts, int likes, int comments, String createdAt, int impressions,
                    int connections, int profileViews, int jobsApplied) {
        super(username, isPublic, country, posts, likes, comments, createdAt, impressions);
        this.connections = connections;
        this.profileViews = profileViews;
        this.jobsApplied = jobsApplied;
        System.out.println("Parameterized constructor of LinkedInAccount called");
    }

    void display() {
        super.display();
        System.out.println("Connections: " + this.connections);
        System.out.println("Profile Views: " + this.profileViews);
        System.out.println("Jobs Applied: " + this.jobsApplied);
    }
}


// YouTube subclass
class YouTubeAccount extends SocialMediaAccount {
    int subscribers;
    int watchTime;
    boolean isMonetized;
    double estimatedRevenue;

    YouTubeAccount() {
        super();
        this.subscribers = 0;
        this.watchTime = 0;
        this.isMonetized = false;
        this.estimatedRevenue = 0.0;
        System.out.println("Default constructor of YouTubeAccount called");
    }

    YouTubeAccount(String username, boolean isPublic, String country, int posts, int likes, int comments, String createdAt, int impressions,
                   int subscribers, int watchTime, boolean isMonetized, double estimatedRevenue) {
        super(username, isPublic, country, posts, likes, comments, createdAt, impressions);
        this.subscribers = subscribers;
        this.watchTime = watchTime;
        this.isMonetized = isMonetized;
        this.estimatedRevenue = estimatedRevenue;
        System.out.println("Parameterized constructor of YouTubeAccount called");
    }

    void display() {
        super.display();
        System.out.println("Subscribers: " + this.subscribers);
        System.out.println("Watch Time: " + this.watchTime);
        System.out.println("Monetized: " + this.isMonetized);
        System.out.println("Estimated Revenue: $" + this.estimatedRevenue);
    }
}


// Test class
class Test
 {
    public static void main(String[] args) {
        SocialMediaAccount s1 = new SocialMediaAccount();
        System.out.println("Account Count: " + SocialMediaAccount.getCount());

        InstagramAccount ig1 = new InstagramAccount();
        ig1.display();
        System.out.println("Account Count: " + SocialMediaAccount.getCount());

        LinkedInAccount li1 = new LinkedInAccount();
        li1.display();
        System.out.println("Account Count: " + SocialMediaAccount.getCount());

        YouTubeAccount yt1 = new YouTubeAccount("TechGuru", true, "India", 200, 5000, 300, "2018-08-10", 100000,
                1000000, 2000000, true, 150000.50);
        yt1.display();
        System.out.println("Account Count: " + SocialMediaAccount.getCount());
    }
}
