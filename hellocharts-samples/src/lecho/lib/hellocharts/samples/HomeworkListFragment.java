/**
 * Copyright (C) 2015 The AndroidPhoneStudent Project
 */
package lecho.lib.hellocharts.samples;

//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//
//import lecho.lib.hellocharts.gesture.ContainerScrollType;
//import lecho.lib.hellocharts.model.Axis;
//import lecho.lib.hellocharts.model.AxisValue;
//import lecho.lib.hellocharts.model.Line;
//import lecho.lib.hellocharts.model.LineChartData;
//import lecho.lib.hellocharts.model.PointValue;
//import lecho.lib.hellocharts.model.ValueShape;
//import lecho.lib.hellocharts.model.Viewport;
//import lecho.lib.hellocharts.util.ChartUtils;

/**
 * 作业列表Fragment
 *
 * @author yangzc on 15/7/2.
 */
public class HomeworkListFragment {
//    private LineChartView mChartView;
//
//    @Override
//    public View onCreateViewImpl(Bundle savedInstanceState) {
//        return View.inflate(getActivity(), R.layout.layout_homework_list, null);
//    }
//
//    @Override
//    public void onViewCreatedImpl(View view, Bundle savedInstanceState) {
//        super.onViewCreatedImpl(view, savedInstanceState);
//        mChartView = (LineChartView) mHeaderView.findViewById(R.id.homework_list_chart);
//        setupChartView();
//    }
//
//    private void setupChartView() {
//        mChartView.setViewportCalculationEnabled(false);
//        mChartView.setValueSelectionEnabled(false);
//        mChartView.setZoomEnabled(false);
//        mChartView.setContainerScrollEnabled(true,
//                ContainerScrollType.HORIZONTAL);
//        mChartView.setOnValueTouchListener(new OnChartValueSelectListener());
//        mChartView.setOnChartScrollListener(new OnBoxChartScrollListener());
//
//        //横轴显示8个
//        final Viewport viewport = new Viewport(mChartView.getMaximumViewport());
//        viewport.bottom = 0;
//        viewport.top = 100;
//        viewport.left = 0;
//        viewport.right = 8;
//        mChartView.setMaximumViewport(viewport);
//        mChartView.setCurrentViewport(viewport);
//        mChartView.setVisibility(View.INVISIBLE);
//    }
//
//    private void loadFinish(List<HomeworkItem> data) {
//        setChartData();
//    }


//
//    private String getSectionText(long time) {
//        String sectionText = "";
//        try {
//            sectionText = DateUtil.parseDate2String(new Date(time), "MM",
//                    Locale.getDefault());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return sectionText;
//    }
//
//    private void setChartData() {
//        int size = mHomeworkInfoList.size();
//        if (size > 0) {
//            Viewport maxViewport = mChartView.getMaximumViewport();
//            maxViewport.right = size;
//            mChartView.setMaximumViewport(maxViewport);
//            LineChartData data = mChartView.getLineChartData();
//            if (data.getAxisXBottom() == null) {
//                Axis axisX = new Axis();
//                axisX.setHasTiltedLabels(true);
//                axisX.setTextSize(11);
//
//                Axis axisY = new Axis().setHasLines(true);
//                data.setAxisXBottom(axisX);
//                data.setAxisYLeft(axisY);
//            }
//            List<HomeworkItem> chartDataSource = new ArrayList<HomeworkItem>(
//                    size);
//            chartDataSource.addAll(mHomeworkInfoList);
//            Collections.reverse(chartDataSource);
//            List<AxisValue> xVals = new ArrayList<AxisValue>();
//            List<PointValue> yValsMyRate = new ArrayList<PointValue>();
//            List<PointValue> yValsClassRate = new ArrayList<PointValue>();
//            HomeworkItem lastHomework = null;
//            for (int index = 0; index < size; index++) {
//                HomeworkItem homework = chartDataSource.get(index);
//                if (index > 0) {
//                    lastHomework = chartDataSource.get(index -1);
//                }
//                if (homework != null) {
//                    String label = DateUtil.parseDate2String(new Date(
//                            homework.addTime * 1000L), "MM/dd", Locale
//                            .getDefault());
//                    String lastLabel = "";
//                    if (null != lastHomework) {
//                        lastLabel = DateUtil.parseDate2String(new Date(
//                                lastHomework.addTime * 1000L), "MM/dd", Locale
//                                .getDefault());
//                    }
//                    String labeltime = DateUtil.getTimeString2(homework.addTime * 1000L);
//                    boolean sameAsLast = index > 0 && !TextUtils.isEmpty(lastLabel) && label.equals(lastLabel);
//                    xVals.add(new AxisValue(index).setLabel(sameAsLast ? labeltime : label));
//                    double myRate = homework.rightRate * 100;
//                    yValsMyRate.add(new PointValue(index, myRate > 0 ? (float) myRate
//                            : 0));
//                    double classRate = homework.classRightRate * 100;
//                    yValsClassRate.add(new PointValue(index,
//                            classRate > 0 ? (float) classRate : 0));
//                }
//            }
//            //设置X轴显示数据
//            data.getAxisXBottom().setValues(xVals);
//
//            List<AxisValue> yVals = new ArrayList<AxisValue>();
//            for (int i = 0; i <= 100; i += 20) {
//                yVals.add(new AxisValue(i).setLabel(i + ""));
//            }
//            data.getAxisYLeft().setValues(yVals);
//
//            List<Line> lines = new ArrayList<Line>();
//            // 我的正确率
//            Line line1 = new Line(yValsMyRate);
//            line1.setColor(getResources().getColor(R.color.color_main));
//            line1.setShape(ValueShape.CIRCLE);
//            line1.setCubic(false);
//            line1.setFilled(true);
//            line1.setHasLabels(false);
//            line1.setHasLines(true);
//            line1.setHasPoints(true);
//            line1.setHasLabelsOnlyForSelected(false);
//            line1.setPointRadius(3);
//            line1.setStrokeWidth(1);
//            lines.add(line1);
//            // 班级正确率
//            Line line2 = new Line(yValsClassRate);
//            line2.setColor(ChartUtils.COLORS[3]);
//            line2.setShape(ValueShape.CIRCLE);
//            line2.setCubic(false);
//            line2.setFilled(true);
//            line2.setHasLabels(false);
//            line2.setHasLabelsOnlyForSelected(false);
//            line2.setHasLines(true);
//            line2.setHasPoints(true);
//            line2.setPointRadius(3);
//            line2.setStrokeWidth(1);
//            lines.add(line2);
//
//            data.setLines(lines);
//            mChartView.setLineChartData(data);
//            if (mChartView.getVisibility() != View.VISIBLE)
//                mChartView.setVisibility(View.VISIBLE);
//        }
//    }





    /*private class OnChartValueSelectListener implements
            LineChartOnValueSelectListener {

        HomeworkChartPopupWindow mPopWindow;
        ChartComputator mComputator;

        public OnChartValueSelectListener() {
            mPopWindow = new HomeworkChartPopupWindow(getActivity());
            mComputator = mChartView.getChartComputator();
        }

        @Override
        public void onValueSelected(int lineIndex, int pointIndex,
                                    PointValue value) {
            int viewWidth = mPopWindow.getWidth();
            int viewHeight = mPopWindow.getHeight();
            int pointRadius = mChartView.getLineChartData().getLines().get(0)
                    .getPointRadius();
            int highlightPointRadius = UIUtils.dip2px(UIUtils
                    .dip2px(pointRadius) + 4);
            float rawX = mComputator.computeRawX(value.getX());
            float rawY = mComputator.computeRawY(value.getY());
            int direction = HomeworkChartPopupWindow.DIRECTION_TOP;
            int[] location = new int[2];
            mChartView.getLocationOnScreen(location);
            float factX = location[0] + rawX;
            float factY = location[1] + rawY;
            if (factX - viewWidth / 2 < 0) {
                factX += highlightPointRadius;
                factY -= (viewHeight / 2);
                direction = HomeworkChartPopupWindow.DIRECTION_RIGHT;
            } else if (factX + viewWidth / 2 > UIUtils
                    .getWindowWidth(getActivity())) {
                factX -= (highlightPointRadius + viewWidth);
                factY -= (viewHeight / 2);
                direction = HomeworkChartPopupWindow.DIRECTION_LEFT;
            } else if (rawY - highlightPointRadius < viewHeight) {
                factX -= (viewWidth / 2);
                factY += highlightPointRadius;
                direction = HomeworkChartPopupWindow.DIRECTION_BOTTOM;
            } else {
                factX -= (viewWidth / 2);
                factY -= (highlightPointRadius + viewHeight);
                direction = HomeworkChartPopupWindow.DIRECTION_TOP;
            }
            mPopWindow.setDirection(direction);
            final HomeworkItem homework = mHomeworkInfoList
                    .get(mHomeworkInfoList.size() - 1 - (int) value.getX());
            mPopWindow.setHomeworkInfo(homework, new OnClickListener() {

                @Override
                public void onClick(View v) {
                    showHomeworkDetail(homework);
                    mPopWindow.dismiss();
                }
            });
            mPopWindow.showAtLocation(mChartView, factX, factY);
        }

        @Override
        public void onValueDeselected() {
            mPopWindow.dismiss();
        }

    }*/



}
