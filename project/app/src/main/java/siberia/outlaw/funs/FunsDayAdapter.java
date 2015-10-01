package siberia.outlaw.funs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asmodeus on 01.10.15.
 */
public class FunsDayAdapter extends RecyclerView.Adapter<FunsDayAdapter.ViewHolder> {
    private List<Subject> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
//        private ImageView icon;
//        private Button deleteButton;
//        private Button copyButton;
//        private DeleteButtonListener deleteButtonListener;
//        private CopyButtonListener copyButtonListener;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.subject_name);
//            icon = (ImageView) itemView.findViewById(R.id.recyclerViewItemIcon);
//            deleteButton = (Button) itemView.findViewById(R.id.recyclerViewItemDeleteButton);
//            copyButton = (Button) itemView.findViewById(R.id.recyclerViewItemCopyButton);
//            deleteButtonListener = new DeleteButtonListener();
//            copyButtonListener = new CopyButtonListener();
//            deleteButton.setOnClickListener(deleteButtonListener);
//            copyButton.setOnClickListener(copyButtonListener);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public FunsDayAdapter(List<Subject> records) {
        this.mDataset = records;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public FunsDayAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        System.out.println("vh on create " + viewType);

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_subject, parent, false);
        parent.addView(v);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        System.out.println("vh bind " + position);
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(mDataset[position]);
        Subject record = mDataset.get(position);
//        int iconResourceId = 0;
//        switch (record.getType()) {
//            case GREEN:
//                iconResourceId = R.drawable.green_circle;
//                break;
//            case RED:
//                iconResourceId = R.drawable.red_circle;
//                break;
//            case YELLOW:
//                iconResourceId = R.drawable.yellow_circle;
//                break;
//        }
//        viewHolder.icon.setImageResource(iconResourceId);
          holder.name.setText(record.getName());
//        viewHolder.deleteButtonListener.setRecord(record);
//        viewHolder.copyButtonListener.setRecord(record);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}