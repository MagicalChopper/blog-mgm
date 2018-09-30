package com.love_peace.blogmgm.blog;

import com.alibaba.fastjson.JSON;
import com.love_peace.blogmgm.entity.User;
import com.love_peace.blogmgm.param.dto.WriteBlogDTO;
import com.love_peace.blogmgm.param.vo.ResultVo;
import com.love_peace.blogmgm.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_15:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WriteBlogTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void testRegist(){
       WriteBlogDTO writeBlogDTO = new WriteBlogDTO();
       writeBlogDTO.setType("JAVA");
       writeBlogDTO.setTitle("懂得什么是共情才是最纯粹的善良");
       writeBlogDTO.setText("写了这么多期善良，记得有位读者朋友发私信给我。善良就真的那么重要吗？你总是说善良的好处，就连你自己也曾发文过度的善良也会毁掉我们。你不觉得自相矛盾吗？以己之矛攻己之盾。\n" +
               "\n" +
               "　　我认为，世间万事万物其实都是利弊相对统一的存在并作用在同一体上的，就好像有一个看不见摸不着的特定区间，范围之内便是好的，而超过了就属于滥用。资源的角度来说讲叫做资源滥用。有一个成语叫做过犹不及也是这个意思。我所说的善并不是佛学角度的善因善缘，不是什么善莫大焉。而是浅/中层次的善良。广泛的应用到生活中的善。只有懂得共情的人，才能把握好善良的尺度，这样的人往往掌握了最合适的方式与人交流，与人为善。他们往往都给人一种拥有超高情商的既视感。那什么是共情呢？雨汐给你讲几个故事，或许你就明白了。\n" +
               "\n" +
               "　　01\n" +
               "\n" +
               "　　我曾看过一篇文章，出处是《天才在左疯子在右》，接下来我给大家简单讲下这个故事。\n" +
               "\n" +
               "　　有一位精神病人，他总是把自己当成一个蘑菇，于是就没日没夜的蹲在角落里，一连几天的不吃不喝，就像是个真正的蘑菇一样。\n" +
               "\n" +
               "　　他很需要被治疗，我想如果换做是我们来充当心理医生的角色。\n" +
               "\n" +
               "　　我们可能会说：“你不是蘑菇啊，赶紧起来吧。”\n" +
               "\n" +
               "　　我们或许会反反复复重复着一句话，重复到自己都觉得烦到不由得去对着病人发火。甚至还会过去伸手用力拽他起来，但我想这个病人还是会无动于衷，不论你使出浑身解数，还是一动不动地走自己的路，做个蘑菇吧。\n" +
               "\n" +
               "　　真正的心理医生是这样做的：“他也撑了一把伞，静静的蹲坐在病人的旁边。”\n" +
               "\n" +
               "　　病人很奇怪地问：“你是谁呀？你为什么也蹲在这里呢？”医生回答：我是一只蘑菇啊。”\n" +
               "\n" +
               "　　病人点点头，继续做他的蘑菇，而他的医生也是一脸平静的陪伴在旁边。一段时间过去了，他们谁都没有说话。\n" +
               "\n" +
               "　　又过了好一会儿，医生站起来走了两步。\n" +
               "\n" +
               "　　病人不解地问：“你是一只蘑菇你怎么能动呢？”\n" +
               "\n" +
               "　　医生说：“蘑菇是可以动的啊。不信你也来试试”病人果不其然站起身子也模仿医生的样子走了一大圈。\n" +
               "\n" +
               "　　他说，“哦，原来做蘑菇也可以动啊。”\n" +
               "\n" +
               "　　没多久医生开始吃饭，他就问：“你怎么可以吃饭啊？”\n" +
               "\n" +
               "　　医生回答：“不吃饭蘑菇怎么能长大呢？长期不吃饭我们是会死掉的呀。”\n" +
               "\n" +
               "　　病人点点头，也模仿着医生的模样吃起饭来。\n" +
               "\n" +
               "　　几周之后，这个病人被治愈了，他终于可以像个正常人一样吃喝玩乐。这个故事告诉我们一个道理：\n" +
               "\n" +
               "　　共情：感同身受的意思，说难也难，说易也易，在别人遇到困顿时，蹲下身来切身的站在对方角度去衡量，再找到最正确的方法帮助他。站在别人的立场看问题，换位思考才是更好的解决问题的不二法门。学会共情，才能触摸到别人心底的柔软，再综合运用自己的善良，对他人提供有效帮助。\n" +
               "\n" +
               "　　02海伦凯勒和她的老师莎莉文\n" +
               "\n" +
               "　　海伦·凯勒是美国著名作家和教育家。1882年，在她一岁多的时候，因为发高烧，脑部受到伤害，从此以后，她的眼睛看不到，耳朵听不到，后来，连话也说不出来了。\n" +
               "\n" +
               "　　她在黑暗中摸索著长大。七岁那一年，家里为她请了一位家庭教师，也就是影响海伦一生的莎莉文老师。莎莉文在小时候眼睛也差点失明，因此她非常了解失去光明的痛苦。在她辛苦的指导下，海伦用手触摸学会手语，摸点字卡学会了读书，后来用手摸别人的嘴唇，终于学会了说话。\n" +
               "\n" +
               "　　莎莉文老师为了让海伦接近大自然，让她在草地上打滚，在田野跑跑跳跳，在地里埋下种子，爬到树上吃饭；还带她去摸一摸刚出生的小猪，也到河边去玩水。海伦在老师爱的关怀下，竟然克服失明与失聪的障碍，完成了大学学业。\n" +
               "\n" +
               "　　1936年，和她朝夕相处五十年的老师离开人间，海伦非常的伤心。海伦知道，如果没有老师的爱，就没有今天的她，决心要把老师给她的爱发扬光大。于是，海伦跑遍美国大大小小的城市，周游世界，为残障的人到处奔走，全心全力为那些不幸的人服务。\n" +
               "\n" +
               "　　1968年，海伦89岁去世，她把所有终生致力服务残障人士的事迹，传遍全世界。她写了很多书，她的故事还拍成了电影。沙利文老师把最珍贵的爱给了她，她又把爱散播给所有不幸的人，带给他们光明和希望。\n" +
               "\n" +
               "　　“世界上最美丽的东西，看不见也摸不着，要靠心灵去感受。”\n" +
               "\n" +
               "　　是的，莎莉文老师教会海伦用心聆听大自然万物，用心去体会生活。连同对于这个世界的爱也一并给了她。而海伦拥有一颗感恩之心的善良达到了是共情的最高层次。得到的关爱无价，那么你也在无价的关爱里学到了怎样去传递最纯粹的人间至爱。\n" +
               "\n" +
               "　　03\n" +
               "\n" +
               "　　我曾在微博上看到这样一个故事\n" +
               "\n" +
               "　　故事的主人公是一个小学生，那年寒假的某天中午，家门口来了一个提着化肥袋子，手拿一个破瓷碗的乞丐，浑身上下都脏兮兮的裤管还满是破洞，但脸还算比较干净。\n" +
               "\n" +
               "　　他看到主人公一家聚在一起吃饭，就问可否能给他点吃的或喝的，刷锅水也行，门外车子上躺着他重病的老婆。他说他如果是自己一个人我可以什么都不要，不吃也不喝。只是不能委屈自己的爱人，\n" +
               "\n" +
               "　　恰好那天一个邻居在家里串门，就说随便给个剩馒头，打发他走之类的话。\n" +
               "\n" +
               "　　但是，奶奶放下手里的筷子，跟妈妈说，“把刚出锅的馒头分一半给他吧，接着回到了屋里拿了点钱给他们。”\n" +
               "\n" +
               "　　那人接过馒头，坚持着说什么也不收那笔钱。最后老人还是把钱硬塞给他。\n" +
               "\n" +
               "　　邻居不解，一直在说风凉话，说什么你们可真有钱之类的。总之从始至终没有一句受听的话。\n" +
               "\n" +
               "　　看着那个陌生男子走远。\n" +
               "\n" +
               "　　老人叹了一口气，说她为了养活一大家子老小，当年也跟人讨过饭，正巧那年赶上闹饥荒，树皮都被人吃光了，过年的时候能吃上芋头叶就不错了。\n" +
               "\n" +
               "　　给她印象最深的是当时有一户人家给了她一个玉米面窝窝头，这件事情给年幼的主人公，造成了很大的冲击，铭记了一生。\n" +
               "\n" +
               "　　很多时候自己以为是同情了别人，其实也是在同情自己。因有类似的境遇才会感同身受。\n" +
               "\n" +
               "　　最高级的善良，就是共情。己所欲，施于人。己所不欲，勿施于人。你以为嘲讽的是别人，其实也是在肮脏自己。\n" +
               "\n" +
               "　　雨汐教你怎样处事1\n" +
               "\n" +
               "　　1。遇事时首先让自己冷静下来，统观全局的同时把一件件小事串联起来从中得出结论：“你是否有错，又错在何处。多从自身找原因而不是一味的挑别人毛病。一个碗碰不响，两个碗叮叮当。”\n" +
               "\n" +
               "　　2。有些出自你口中的话就像一个个锋利匕首，太过伤人不要说出来。钉子易拔而钉痕仍在。错误有则改之，无则加勉。不讲求日三省吾身，但同一个错误不要犯第二次。说出的话就像泼出去的水覆水难收，而且很多时候你也会为自己说的话做的事感到后悔。\n" +
               "\n" +
               "　　3。换位思考，不偏不倚。即使是对于自己。或者你可以这样想有时候对自己严格未尝不是件好事，吃亏也是一种福分。人生不是一马平川。挫折里更让你懂得物竞天择，适者生存。\n" +
               "\n" +
               "　　4。推心置腹，推己及人。待人多容人，而不要有过多小人之心。你也可以这么想强出头的是废物，能屈能伸才是人物。\n" +
               "\n" +
               "　　5。当你可以做到以上这些，雨汐推荐一本书意大利作家埃迪蒙托·德·亚米契斯创作的长篇日记体小说《爱的教育》细读每一个故事，你定会有不一样的领悟。");
       ResultVo resultVo = blogService.writeBlog(writeBlogDTO);
       System.out.println(JSON.toJSONString(resultVo));
    }
}
