package cdflynn.android.sample.turn;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {

    private final LayoutInflater layoutInflater;
    private List<Entity> mlist = new ArrayList<>();

    public SampleAdapter(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public SampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.view_sample, parent, false);
        return new SampleViewHolder(view);
    }

    public SampleAdapter setListener(View.OnClickListener listener) {
        this.listener = listener;
        return this;
    }

    View.OnClickListener listener;

    @Override
    public void onBindViewHolder(SampleViewHolder holder, int position) {
        holder.tvName.setText(mlist.get(position).getName());
        holder.tvName.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public void setData(List<Entity> list) {
        mlist = list;
        notifyDataSetChanged();
    }

    class SampleViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public SampleViewHolder(View itemView) {
            super(itemView);
            this.tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
