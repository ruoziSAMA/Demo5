package com.example.dengyikang.demo3;

import java.util.List;

/**
 * Created by DengYiKang on 2017/11/13.
 */

public class json {

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * aid : 16234366
         * last_recommend : [{"mid":7419,"time":1510553555,"msg":"神调教！","uname":"黑岩·镜","face":"http://i2.hdslb.com/bfs/face/26ac05af8703b5e0184eaa862d14e3fbcc850410.jpg"}]
         * typeid : 30
         * typename : VOCALOID·UTAU
         * title : 【闇音レンリ】Beautiful World / 宇多田光【犬神様】
         * subtitle :
         * play : 3759
         * review : 89
         * video_review : 44
         * favorites : 969
         * mid : 797614
         * author : よんあか
         * description : sm32252874
         ポッキーおいしい
         Original music / 宇多田ヒカル
         Edit、MIX / 犬神様 http://www.nicovideo.jp/mylist/44803605
         illust、Movie / 続き http://www.nicovideo.jp/mylist/58077272
         * create : 2017-11-11 21:03
         * pic : http://i2.hdslb.com/bfs/archive/aae33c9cdd68ac0fe6bd7ada5c4dbc5b6cfccd8c.jpg
         * credit : 0
         * coins : 224
         * duration : 5:20
         */

        private int aid;
        private int typeid;
        private String typename;
        private String title;
        private String subtitle;
        private int play;
        private int review;
        private int video_review;
        private int favorites;
        private int mid;
        private String author;
        private String description;
        private String create;
        private String pic;
        private int credit;
        private int coins;
        private String duration;
        private List<LastRecommendBean> last_recommend;

        public int getAid() {
            return aid;
        }

        public void setAid(int aid) {
            this.aid = aid;
        }

        public int getTypeid() {
            return typeid;
        }

        public void setTypeid(int typeid) {
            this.typeid = typeid;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int getPlay() {
            return play;
        }

        public void setPlay(int play) {
            this.play = play;
        }

        public int getReview() {
            return review;
        }

        public void setReview(int review) {
            this.review = review;
        }

        public int getVideo_review() {
            return video_review;
        }

        public void setVideo_review(int video_review) {
            this.video_review = video_review;
        }

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreate() {
            return create;
        }

        public void setCreate(String create) {
            this.create = create;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public int getCoins() {
            return coins;
        }

        public void setCoins(int coins) {
            this.coins = coins;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public List<LastRecommendBean> getLast_recommend() {
            return last_recommend;
        }

        public void setLast_recommend(List<LastRecommendBean> last_recommend) {
            this.last_recommend = last_recommend;
        }

        public static class LastRecommendBean {
            /**
             * mid : 7419
             * time : 1510553555
             * msg : 神调教！
             * uname : 黑岩·镜
             * face : http://i2.hdslb.com/bfs/face/26ac05af8703b5e0184eaa862d14e3fbcc850410.jpg
             */

            private int mid;
            private int time;
            private String msg;
            private String uname;
            private String face;

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public String getUname() {
                return uname;
            }

            public void setUname(String uname) {
                this.uname = uname;
            }

            public String getFace() {
                return face;
            }

            public void setFace(String face) {
                this.face = face;
            }
        }
    }
}
