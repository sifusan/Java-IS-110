import java.util.Iterator;
import java.util.ArrayList;
public class StefaHelp {
    private String name;
    private int price;
    private static ArrayList<Comment> comments;
    
    public static void main(String[] args) {
        Comment fuyu = new Comment(2);
        //Comment okeyIguess = new Comment(3);
        comments = new ArrayList<Comment>();
        comments.add(fuyu);
        //comments.add(okeyIguess);
        findMostHelpfulComment();
    }
    
    public StefaHelp(String name, int price) {
        this.name = name;
        this.price = price;
        //comments = new ArrayList<Comment>();
    }
    
    public static Comment findMostHelpfulComment() {
        Iterator <Comment> it = comments.iterator();
        if(it.hasNext()) {
            Comment best = it.next();
            while(it.hasNext()) {
                Comment current = it.next();
                if(current.getVoteCount() > best.getVoteCount()) {
                    best = current;
                }
            }
            System.out.println(best);
            return best;
        }
        else {
            System.out.println("There are no comments");
            return null;
        }
    }
}

class Comment {
    private int votes;
    
    public Comment (int votes) {
        votes = 0;
    }
    
    public int getVoteCount() {
        return votes;
    }
    
    public void upVote() {
        votes++;
    }
}
