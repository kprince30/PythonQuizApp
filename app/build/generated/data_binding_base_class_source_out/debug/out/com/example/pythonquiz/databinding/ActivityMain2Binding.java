// Generated by view binder compiler. Do not edit!
package com.example.pythonquiz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pythonquiz.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button no;

  @NonNull
  public final TextView ques;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final Button yes;

  private ActivityMain2Binding(@NonNull ConstraintLayout rootView, @NonNull Button no,
      @NonNull TextView ques, @NonNull TextView textView4, @NonNull Button yes) {
    this.rootView = rootView;
    this.no = no;
    this.ques = ques;
    this.textView4 = textView4;
    this.yes = yes;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.no;
      Button no = ViewBindings.findChildViewById(rootView, id);
      if (no == null) {
        break missingId;
      }

      id = R.id.ques;
      TextView ques = ViewBindings.findChildViewById(rootView, id);
      if (ques == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.yes;
      Button yes = ViewBindings.findChildViewById(rootView, id);
      if (yes == null) {
        break missingId;
      }

      return new ActivityMain2Binding((ConstraintLayout) rootView, no, ques, textView4, yes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
