package com.example.hoaithuong.hci_android.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hoaithuong.hci_android.R;
import com.example.hoaithuong.hci_android.UI.fragment_book_detail;
import com.example.hoaithuong.hci_android.adapter.book_adapter;
import com.example.hoaithuong.hci_android.model.book_model;

import java.util.ArrayList;

/**
 * Created by hoai thuong on 1/17/2018.
 */

public class fragment_book extends Fragment{

    private View myv;
    private ArrayList<book_model> arrayList;
    private book_adapter adapter;
    private TextView textView;
    private ListView listView;
    private ImageButton imageButton;
    private EditText edt;
    private FrameLayout layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myv = inflater.inflate(R.layout.fr_book, container, false);
        textView = myv.findViewById(R.id.tvfrBook);
        listView = myv.findViewById(R.id.lvfrBook);
        imageButton = myv.findViewById(R.id.imbtnsearch);
        imageButton.setImageResource(R.drawable.search);
        layout = myv.findViewById(R.id.layout);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "font/ft.ttf");
        textView.setTypeface(font);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt = new EditText(myv.getContext());
                textView.setText("");
                layout.addView(edt,1);
            }
        });
        setView();
        return myv;
    }

    private void setView() {
        arrayList = new ArrayList<book_model>();
        ArrayList<String> a = new ArrayList<>();
        a.add( "Tiểu thuyết");
        a.add( "Văn học hiện đại");
        arrayList.add(new book_model("Harry Potter","J. K. Rowling",  "Harry Potter là tên của bộ truyện (gồm bảy phần) của nữ nhà văn nước Anh J. K. Rowling. Bộ truyện viết về những cuộc phiêu lưu phù thủy của cậu bé Harry Potter và những người bạn Ronald Weasley, Hermione Granger, lấy bối cảnh tại Trường Phù thủy và Pháp sư Hogwarts nước Anh. Những cuộc phiêu lưu tập trung vào cuộc chiến của Harry Potter trong việc chống lại tên Chúa tể hắc ám Voldemort - người có tham vọng muốn trở nên bất tử, thống trị thế giới phù thủy, nô dịch hóa những người phi pháp thuật và tiêu diệt những ai cản đường hắn đặc biệt là Harry Potter.",
                "https://ewedit.files.wordpress.com/2016/09/9781408855652-png.jpg?w=409",  a,1
        ));

       a = new ArrayList<>();
        a.add( "Tiểu thuyết");
        a.add("Trinh thám");
        arrayList.add(new book_model("Án mạng trên sông Nile",
                "Agatha Christie",
                "Linnet Ridgeway sở hữu trong tay tất cả mọi thứ mà bất cứ một người nào cũng có thể lấy làm ghen tị: tuổi trẻ, sắc đẹp, sự thông minh, của cải và một vị hôn phu rất xứng với cô. Rồi một ngày nọ, người bạn thân nhất của Linnet – Jackie – đưa vị hôn phu điển trai của mình là Simon Doyle đến, để xin Linnet cho anh một việc làm. Giờ thì chính Linnet và Simon lại đi hưởng tuần trăng mật với nhau, trên một chuyến tàu dạo quanh sông Nile. Bất chợt, Linnet bị giết hại, Jackie trở thành đối tượng bị tình nghi hàng đầu nhưng cô không hề có khả năng thực hiện được điều ấy. Không chỉ dừng lại ở đó, thủ phạm lần lượt ra tay thêm với hai vị khách nữa trong đoàn. Đúng là một vụ án bí hiểm, không có manh mối, nhân chứng, và đoàn khách du lịch dường như cũng không có mối quan hệ với nạn nhân. Tuy nhiên, không có điều gì có thể lọt khỏi tầm mắt của thám tử lừng danh Hercule Poirot.",
                "https://i.imgur.com/pmniSTD.jpg",
                a,1));

        a = new ArrayList<>();
        a.add( "Tiểu thuyết");
        arrayList.add(new book_model("Bay trên tổ chim cúc cu",
                "Ken Kesey",
                "Mọi chuyện xảy ra ở một trại tâm thần đầy quy tắc bị đảo lộn hoàn toàn khi McMurphy xuất hiện. Bất trị như một chú ngựa hoang, hắn vào viện để trốn án lao động khổ sai và không hề có ý định cứu thế. Nhưng trong những ngày ở đó, cái phần tốt đẹp yêu tự do, thích tung hoành của hắn đã làm nên một cuộc cách mạng, tạo ra mối liên kết giữa những thân xác yếu ớt, những trí não bị tổn thương, nhắc họ nhớ về cá tính, về chính mình hoặc về những kẻ đã-từng-là-mình. Sự nổi loạn đó thách thức trật tự đạo đức giả mà Liên hợp áp đặt.. Cuộc chiến bất cân sức bắt đầu. Và rồi đúng như cuộc đời, kẻ yếu đã không thể thắng. McMurphy đã chết dữ dội như cách hắn sống, nhưng Liên hợp không giết được hắn, cũng không thể bắt hắn sống theo cách nó đặt ra…",
                "https://i.imgur.com/Esua39l.jpg",
                a,0));

        a = new ArrayList<>();
        a.add( "Văn học");
        arrayList.add(new book_model("Bến không chồng",
                "Dương Hướng",
                "Bến không chồng”- Bức tranh thê lương thời hậu chiến. Từ tiểu thuyết của Dương Hướng, những Nguyễn Vạn, những Nghĩa… đã bước lên màn ảnh với đủ cơ cực, đắng cay của số phận người lính bước ra cuộc chiến. Họ cô độc trên chính mảnh đất, với chính những con người- họ đã từng đổ máu để bảo vệ…",
                "https://i.imgur.com/b6P59Yv.jpg",
                a,0));

        a = new ArrayList<>();
        a.add( "Kỹ năng sống");
        arrayList.add(new book_model("Đắc nhân tâm",
                "Dale Carnegie",
                "Đắc Nhân Tâm không đơn thuần là cách cư xử chỉ để được lòng người. Đó là một trong những nhận thức hình thành nhân cách con người theo những chuẩn giá trị được đa số đồng ý và chia sẻ. Trong cuộc sống, Đắc Nhân Tâm thể hiện qua sự quan tâm, tôn trọng những người quanh ta và xã hội mình đang sống. Trong kinh doanh, nó thể hiện sự công bằng (fairness) và tư duy cùng thắng (win-win). Trách nhiệm với cộng đồng, với xã hội qua sự đóng góp của bản thân từng con người và doanh nghiệp, hiểu theo “đắc nhân tâm”, sẽ không còn là sự “cố gắng làm hài lòng” hoặc “ban phát” mà chính là thước đo nhân cách, là bổn phận và trách nhiệm của những người quản lý và doanh nghiệp đó.",
                "https://i.imgur.com/kJFRSUS.jpg",
                a, 0));

        arrayList.add(new book_model("Dám nghĩ lớn",
                "David J. Schwartz, Ph.D.",
                "Dám Nghĩ Lớn\\\" nói về sự khác nhau giữa người giàu và người nghèo, người thành công và người thất bại. Tất cả ở cách chúng ta nghĩ, có câu nói \\\"Dù bạn nghĩ bạn sẽ thành công hay bạn sẽ thất bại, bạn đều đúng\\\" của Henry Ford. Chúng ta cùng nghĩ \\\"lớn\\\" nhé.",
                "https://i.imgur.com/YJOuZMf.jpg",
                a, 1));
        adapter = new book_adapter(getActivity(), R.layout.lv_book, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), fragment_book_detail.class);
               intent.putExtra("name", arrayList.get(i).getTitle());
                intent.putExtra("writer", arrayList.get(i).getAuthor());
                intent.putExtra("image", arrayList.get(i).getImage());
                intent.putExtra("status", arrayList.get(i).getStatus());
                intent.putExtra("tag", arrayList.get(i).getTags());
                intent.putExtra("des", arrayList.get(i).getDescription());
                startActivity(intent);
            }
        });
    }
}
