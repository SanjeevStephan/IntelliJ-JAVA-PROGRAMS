package stephanware;

public class Bookmark {

    int chapter_no,program_no,page_no;
    String chapter_name,program_title;
    String[] program_details;
    String[] key_list = {"Chapter","Program Number","Page Number","Chapter Name","Program Title"};
    public Bookmark(int chapter_no, int program_no, int page_no, String chapter_name, String program_title) {
        this.chapter_no = chapter_no;
        this.program_no = program_no;
        this.page_no = page_no;
        this.chapter_name = chapter_name;
        this.program_title = program_title;
    }

    public String[] GetProgramDetails() {

        program_details = new String[]{
                Integer.toString(chapter_no),
                Integer.toString(program_no),
                Integer.toString(page_no),
                chapter_name,
                program_title
        };

        return program_details;
    }


    public void ShowProgramDetails() {

        int total_length = GetProgramDetails().length;
        System.out.println("==============[ Program Details ]===================");
        for(int i = 0; i < total_length ; i++) {
            System.out.println("  [" + (i+1) + "] " + key_list[i] + " : " +  GetProgramDetails()[i]);
        }
        System.out.println("===========[ Program Details Ends ]=================");

    }

    public void StartBanner() { System.out.println("============================[ Program Starts ]======================"); }
    public void EndBanner()   { System.out.println("============================[ Program Ends ]======================"); }



}
