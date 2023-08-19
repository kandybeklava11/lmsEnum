public enum Kyrgyzystan {
    MONDAY {
        @Override
        public String eee() {
            return "Биринчи куну: бизде Нуриса эже сабак отот";
        }
    },
    TUESDAY {
        @Override
        public String eee() {
            return "Экинчи куну: Айназик эже бизге сешшн отот";
        }
    },
    WEDNESDAY {
        @Override
        public String eee() {
            return "Учунчу куну: Аэлита эже бизге Англис тилин отот ";
        }
    },
    THURSDAY {
        @Override
        public String eee() {
            return "Тортунчу куну: Отулгон темаларды кайталайбыз";
        }
    },
    FRIDAY {
        @Override
        public String eee() {
            return "Бешинчи куну: биге Нуриса эже жаны теманы тушундуруп берет";
        }
    },
    SATURDAY {
        @Override
        public String eee() {
            return " Алтынчы куну: дем алыш";
        }
    },
    SUNDAY {
        @Override
        public String eee() {
            return "Жетинчи куну: дем алыш";
        }
    };

    public abstract String eee();

}
