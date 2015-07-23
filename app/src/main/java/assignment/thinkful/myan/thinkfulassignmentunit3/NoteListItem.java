package assignment.thinkful.myan.thinkfulassignmentunit3;

/**
 * Created by myan on 7/22/15.
 */
public class NoteListItem {
    private String mText;
    public NoteListItem(String text) {
        this.mText = text;
    }
    public String getText() {
        return mText;
    }

    public NoteListItem setText(String text) {
        this.mText = text;
        return this;
    }
}
