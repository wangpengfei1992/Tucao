package me.sweetll.tucao.business.drrr.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import me.sweetll.tucao.R
import me.sweetll.tucao.business.drrr.model.Post
import me.sweetll.tucao.util.RelativeDateFormat

class PostAdapter(data: MutableList<Post>?): BaseQuickAdapter<Post, BaseViewHolder>(R.layout.item_post, data) {

    override fun convert(helper: BaseViewHolder, item: Post) {
        helper.setText(R.id.text_time, RelativeDateFormat.format(item.createDt))
        helper.setText(R.id.text_content, item.content)
        helper.setText(R.id.text_reply_num, "${item.replyNum}")
        helper.setText(R.id.text_vote_num, "${item.voteNum}")
    }

}