package layout

class CoursesRecyclerViewAdapter(val CoursesList: List<Coursesactivity>) :
    RecyclerView.Adapter<CoursesRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_courses_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return CoursesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvCourses.text = CoursesList[position]
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}