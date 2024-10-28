class Remove_Sub_Folders_from_the_Filesystem {
    
    public List<String> removeSubfolders(String... folder) {
        return new MyList(folder);
    }

    static class MyList extends ArrayList<String> {
        String[] strs;

        public MyList(String[] strs) {
            this.strs = strs;
        }

        public int size() {
            if (strs != null)
                method();
            return super.size();
        }

        private void method() {
            String[] strs = this.strs;
            Arrays.sort(strs);
            int i = 0;
            while (i < strs.length) {
                String str = strs[i++];
                super.add(str);
                str+='/';
                while (i< strs.length&&strs[i].startsWith(str)) i++;

            }
            this.strs = null;
        }

    }
}
