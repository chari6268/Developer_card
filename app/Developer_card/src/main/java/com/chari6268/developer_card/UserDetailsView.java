package com.chari6268.developer_card;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class UserDetailsView extends ConstraintLayout {
    private TextView nameTextView, batchTextView;
    private ImageView githubTextView, linkedinTextView, ProfileView;

    public UserDetailsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.user_details_layout, this, true);

        ProfileView = findViewById(R.id.chari_profile);
        nameTextView = findViewById(R.id.text_name);
        batchTextView = findViewById(R.id.text_batch);
        githubTextView = findViewById(R.id.chari_github);
        linkedinTextView = findViewById(R.id.chari_Linkedin);
    }

    public void setUserDetails(UserDetails userDetails,Context context) {
        ProfileView.setImageResource(userDetails.getImageView());
        nameTextView.setText(userDetails.getName());
        batchTextView.setText(userDetails.getBatch());
        githubTextView.setOnClickListener(view -> openUrl(context, userDetails.getGithubUrl()));
        linkedinTextView.setOnClickListener(view -> openUrl(context, userDetails.getLinkedinUrl()));
    }

    private void openUrl(Context context, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(intent);
    }
}
