package ggikko.me.decopraticeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> test = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view); //view binding - recyclerview
        recyclerView.setAdapter(new GgikkoApdater(makeMockData()));//set adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)); // set layoutManager
        recyclerView.addItemDecoration(new GgikkoDecoration()); // set decorator
    }

    private List<String> makeMockData() {
        for (int i = 0; i < 100; i++) {
            test.add("hello " + i);
        }
        return test;
    }

    public class GgikkoApdater extends RecyclerView.Adapter<GgikkoViewHolder> {

        private List<String> test = new ArrayList<>();

        public GgikkoApdater(List<String> test) {
            this.test = test;
        }

        @Override
        public GgikkoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.testlayout, parent, false);
            return new GgikkoViewHolder(view);
        }

        @Override
        public void onBindViewHolder(GgikkoViewHolder holder, int position) {
            holder.textView.setText(test.get(position));
        }

        @Override
        public int getItemCount() {
            return test.size();
        }
    }

    public class GgikkoViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public GgikkoViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.testTextView);
        }
    }
}
